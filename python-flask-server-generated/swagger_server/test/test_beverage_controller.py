# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.beverage import Beverage  # noqa: E501
from swagger_server.models.beverages_body import BeveragesBody  # noqa: E501
from swagger_server.models.beverages_id_body import BeveragesIdBody  # noqa: E501
from swagger_server.models.beverages_id_body1 import BeveragesIdBody1  # noqa: E501
from swagger_server.models.error_response import ErrorResponse  # noqa: E501
from swagger_server.models.inline_response200 import InlineResponse200  # noqa: E501
from swagger_server.test import BaseTestCase


class TestBeverageController(BaseTestCase):
    """BeverageController integration test stubs"""

    def test_create_beverage(self):
        """Test case for create_beverage

        Create a new beverage
        """
        body = BeveragesBody()
        response = self.client.open(
            '/v2/beverages',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_beverage(self):
        """Test case for delete_beverage

        Delete a beverage
        """
        response = self.client.open(
            '/v2/beverages/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_beverage_by_id(self):
        """Test case for get_beverage_by_id

        Retrieve a beverage by ID
        """
        response = self.client.open(
            '/v2/beverages/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_beverages(self):
        """Test case for get_beverages

        Retrieve all beverages
        """
        query_string = [('page', 2),
                        ('per_page', 50)]
        response = self.client.open(
            '/v2/beverages',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_replace_beverage(self):
        """Test case for replace_beverage

        Update a beverage
        """
        body = BeveragesIdBody()
        response = self.client.open(
            '/v2/beverages/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_beverage(self):
        """Test case for update_beverage

        Partially update a beverage
        """
        body = BeveragesIdBody1()
        response = self.client.open(
            '/v2/beverages/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
