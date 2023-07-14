package com.example.back_end.controller;

import com.example.back_end.dto.CustomerSaveDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CustomerSaveController_updateCustomer {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * Create by DatNT
     * Date update 14/07/2023
     * Test method update with id_customer =1 
     * @expect successful and status HttpStatus.Created
     * @throws Exception
     */
    @Test
    public void updateCustomer_18() throws Exception {
        Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyen Van Anh");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hai Chau, Da Nang");
        customerSaveDto.setCitizenCode("123456789012");
        customerSaveDto.setImage("https://pvb.com/avatarr.jpg");
        customerSaveDto.setFrontCitizen("https://pvb.com/mattruoc.jpg");
        customerSaveDto.setBackCitizen("https://pvb.com/matsau.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

    /**
     * Create by DatNT
     * Date update 14/07/2023
     * Test method update with id_customer =1  [item] null
     * @expect Error and status HttpStatus.4x
     * @throws Exception
     */
    @Test
    public void updateCustomer_name_13() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}null", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_birthday_13() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}null", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_gender_13() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}null", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_phoneNumber_13() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}null", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_email_13() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}null", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_address_13() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}null", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_citizenCode_13() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}null", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_image_13() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}null", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_frontCitizen_13() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}null", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_backCitizen_13() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}null", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_delete_13() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}null", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by DatNT
     * Date update 14/07/2023
     * Test method update with id_customer =1  [item] ""
     * @expect Error and status HttpStatus.4x
     * @throws Exception
     */

    @Test
    public void updateCustomer_name_14() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}''", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_birthday_14() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}''", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_phoneNumber_14() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}''", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_email_14() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}''", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_address_14() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}''", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_citizenCode_14() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}''", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_image_14() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}''", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_frontCitizen_14() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}''", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_backCitizen_14() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}''", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    /**
     * Create by DatNT
     * Date update 14/07/2023
     * Test method update with id_customer =1  [item] wrong format
     * @expect Error and status HttpStatus.4x
     * @throws Exception
     */

    @Test
    public void updateCustomer_name_15() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("234234");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_birthday_15() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("12-2023-12");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_phoneNumber_15() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("99876dffg4321");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_email_15() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("@@");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_address_15() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("41234ancb23");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_citizenCode_15() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("ppwoi232312332");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_image_15() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_frontCitizen_15() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-ga");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_backCitizen_15() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by DatNT
     * Date update 14/07/2023
     * Test method update with id_customer =1  [item] wrong Not greater than or equal to min length
     * @expect Error and status HttpStatus.4x
     * @throws Exception
     */

    @Test
    public void updateCustomer_name_16() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("a");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_birthday_16() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("12-12");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_phoneNumber_16() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("97");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_email_16() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("b@a.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_address_16() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_citizenCode_16() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("2332");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_image_16() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://a.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_frontCitizen_16() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://i.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_backCitizen_16() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://i.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by DatNT
     * Date update 14/07/2023
     * Test method update with id_customer =1  [item] wrong greater than to max length
     * @expect Error and status HttpStatus.4x
     * @throws Exception
     */

    @Test
    public void updateCustomer_name_17() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đaaaaaaaaaaaeeeeeeeeeeeeeeeerwerwrrrrrrrrrraaaaaaaaaaaaaaaaaaaaat Đatttttttttttttttt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_phoneNumber_17() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("09847854678678678678685532");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_email_17() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbb@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_address_17() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("số 2223 Nguyễn Văn linh, Đà Nẵng Nẵng Nẵng Nẵng Nẵng Nẵng Nẵng Nẵng Nẵng Nẵng Nẵng Nẵng, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_citizenCode_17() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("23231233212455555555555553453231233212455555555555553453231233212455555555555553453453431434");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_image_17() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://aimages.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thimages.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thimages.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thimages.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thimages.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/th.jpg");
        customerSaveDto.setFrontCitizen("mattruoc_img1");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_frontCitizen_17() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22_22i.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateCustomer_backCitizen_17() throws Exception {
         Long customerId = 1L; // ID của khách hàng cần cập nhật

        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setId(customerId);
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0987678902");
        customerSaveDto.setEmail("toan.nang@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028789789323");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22_22i.jpg");
        customerSaveDto.setDelete(false);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/customer/api/{id}", customerId)
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

}
