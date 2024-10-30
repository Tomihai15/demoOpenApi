# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.error_response import ErrorResponse  # noqa: E501
from swagger_server.models.ingredient import Ingredient  # noqa: E501
from swagger_server.models.ingredients_body import IngredientsBody  # noqa: E501
from swagger_server.models.ingredients_id_body import IngredientsIdBody  # noqa: E501
from swagger_server.models.ingredients_id_body1 import IngredientsIdBody1  # noqa: E501
from swagger_server.test import BaseTestCase


class TestIngredientController(BaseTestCase):
    """IngredientController integration test stubs"""

    def test_create_ingredient(self):
        """Test case for create_ingredient

        Create a new ingredient
        """
        body = IngredientsBody()
        response = self.client.open(
            '/v2/ingredients',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_ingredient(self):
        """Test case for delete_ingredient

        Delete an ingredient
        """
        response = self.client.open(
            '/v2/ingredients/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_ingredient_by_id(self):
        """Test case for get_ingredient_by_id

        Retrieve an ingredient by ID
        """
        response = self.client.open(
            '/v2/ingredients/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_ingredients(self):
        """Test case for get_ingredients

        Retrieve all ingredients
        """
        response = self.client.open(
            '/v2/ingredients',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_replace_ingredient(self):
        """Test case for replace_ingredient

        Update an ingredient
        """
        body = IngredientsIdBody()
        response = self.client.open(
            '/v2/ingredients/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_ingredient(self):
        """Test case for update_ingredient

        Update an ingredient
        """
        body = IngredientsIdBody1()
        response = self.client.open(
            '/v2/ingredients/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
