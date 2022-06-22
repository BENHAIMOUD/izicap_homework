package org.haimoud.izicap_homework.service;

import org.haimoud.izicap_homework.model.Company;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class JsonParsingServiceTest {


    @Autowired
    @Mock
    JsonParsingService jsonParsingService;

    @Autowired
    MockMvc mockMvc;

    @BeforeEach
    void setup(){
        jsonParsingService = Mockito.mock(JsonParsingService.class);
    }

    /**
     *
     * @throws URISyntaxException
     * @throws ParseException
     * @throws IOException
     */
    @Test
    void getCompanyInfos() throws URISyntaxException, ParseException, IOException {
        Company company = new Company();
        company.setId(449321770L);
        company.setDate_creation("00017");
        company.setGeo_adresse("261 Chemin des Colles 06140 Vence");
        company.setDate_creation("1978-01-01");
        company.setNumero_tva_intra("FR96313029795");
        company.setFullName("Not Found IN THE API");

        when(jsonParsingService.getCompanyInfos("31302979500017")).thenReturn(company);

        assertEquals(company.getDate_creation(),jsonParsingService.getCompanyInfos("31302979500017").getDate_creation());
    }

}