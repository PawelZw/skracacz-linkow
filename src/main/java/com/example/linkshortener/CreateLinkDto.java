package com.example.linkshortener;

import java.time.LocalDate;


    record CreateLinkDto(

            String id,
            String email,
            String targetUrl,
            LocalDate expirationDate) {



            public LinkDto toDto() {
                return new LinkDto(
                        id,
                        email,
                        targetUrl,
                        expirationDate,
                        0
                );
            }
        }







