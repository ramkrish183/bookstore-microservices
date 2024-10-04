package com.rameshj.bookstore.orders.web.controllers;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;

import com.rameshj.bookstore.orders.AbstractIT;
import com.rameshj.bookstore.orders.domain.models.OrderSummary;
import com.rameshj.bookstore.orders.testdata.TestDataFactory;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import java.util.List;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.jdbc.Sql;

//@Sql("/test-orders.sql")
class OrderControllerTests extends AbstractIT {
}
