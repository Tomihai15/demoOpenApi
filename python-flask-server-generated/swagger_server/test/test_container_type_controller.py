# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.container_type import ContainerType  # noqa: E501
from swagger_server.models.containertypes_body import ContainertypesBody  # noqa: E501
from swagger_server.models.containertypes_id_body import ContainertypesIdBody  # noqa: E501
from swagger_server.models.containertypes_id_body1 import ContainertypesIdBody1  # noqa: E501
from swagger_server.models.error_response import ErrorResponse  # noqa: E501
from swagger_server.models.inline_response2001 import InlineResponse2001  # noqa: E501
from swagger_server.test import BaseTestCase


class TestContainerTypeController(BaseTestCase):
    """ContainerTypeController integration test stubs"""

    def test_create_container_type(self):
        """Test case for create_container_type

        Create a new container type
        """
        body = ContainertypesBody()
        response = self.client.open(
            '/v2/container-types',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_container_type(self):
        """Test case for delete_container_type

        Delete a container type
        """
        response = self.client.open(
            '/v2/container-types/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_container_type_by_id(self):
        """Test case for get_container_type_by_id

        Retrieve a container type by ID
        """
        response = self.client.open(
            '/v2/container-types/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_container_types(self):
        """Test case for get_container_types

        Retrieve all container types
        """
        response = self.client.open(
            '/v2/container-types',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_container_type(self):
        """Test case for put_container_type

        Update a container type
        """
        body = ContainertypesIdBody()
        response = self.client.open(
            '/v2/container-types/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_container_type(self):
        """Test case for update_container_type

        Update a container type
        """
        body = ContainertypesIdBody1()
        response = self.client.open(
            '/v2/container-types/{id}'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
