# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.brand import Brand  # noqa: E501
from swagger_server.models.brands_body import BrandsBody  # noqa: E501
from swagger_server.models.brands_id_body import BrandsIdBody  # noqa: E501
from swagger_server.models.brands_id_body1 import BrandsIdBody1  # noqa: E501
from swagger_server.models.error_response import ErrorResponse  # noqa: E501
from swagger_server.test import BaseTestCase


class TestBrandController(BaseTestCase):
    """BrandController integration test stubs"""

    def test_create_brand(self):
        """Test case for create_brand

        Create a new brand
        """
        body = BrandsBody()
        response = self.client.open(
            '/v2/brands',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_brand(self):
        """Test case for delete_brand

        Delete a brand
        """
        response = self.client.open(
            '/v2/brands/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_brand_by_id(self):
        """Test case for get_brand_by_id

        Retrieve a brand by ID
        """
        response = self.client.open(
            '/v2/brands/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_brands(self):
        """Test case for get_brands

        Retrieve all brand
        """
        query_string = [('page', 2),
                        ('per_page', 50)]
        response = self.client.open(
            '/v2/brands',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_replace_brand(self):
        """Test case for replace_brand

        Update a brand
        """
        body = BrandsIdBody()
        response = self.client.open(
            '/v2/brands/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_brand(self):
        """Test case for update_brand

        Partially update a brand
        """
        body = BrandsIdBody1()
        response = self.client.open(
            '/v2/brands/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
