# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.error_response import ErrorResponse  # noqa: E501
from swagger_server.models.id_labels_body import IdLabelsBody  # noqa: E501
from swagger_server.models.label import Label  # noqa: E501
from swagger_server.models.labels_id_body import LabelsIdBody  # noqa: E501
from swagger_server.models.labels_id_body1 import LabelsIdBody1  # noqa: E501
from swagger_server.test import BaseTestCase


class TestLabelController(BaseTestCase):
    """LabelController integration test stubs"""

    def test_create_label(self):
        """Test case for create_label

        Create a new label
        """
        body = IdLabelsBody()
        response = self.client.open(
            '/v2/beverages/{id}/labels'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_label(self):
        """Test case for delete_label

        Delete a label
        """
        response = self.client.open(
            '/v2/beverages/{beverageId}/labels/{id}'.format(beverage_id='38400000-8cf0-11bd-b23e-10b96e4ef00d', id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_label_by_id(self):
        """Test case for get_label_by_id

        Retrieve a label by ID and beverage ID
        """
        response = self.client.open(
            '/v2/beverages/{beverageId}/labels/{id}'.format(beverage_id='38400000-8cf0-11bd-b23e-10b96e4ef00d', id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_labels(self):
        """Test case for get_labels

        Retrieve all labels
        """
        response = self.client.open(
            '/v2/beverages/{id}/labels'.format(id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_replace_label(self):
        """Test case for replace_label

        Update a label
        """
        body = LabelsIdBody()
        response = self.client.open(
            '/v2/beverages/{beverageId}/labels/{id}'.format(beverage_id='38400000-8cf0-11bd-b23e-10b96e4ef00d', id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_label(self):
        """Test case for update_label

        Partially update a label
        """
        body = LabelsIdBody1()
        response = self.client.open(
            '/v2/beverages/{beverageId}/labels/{id}'.format(beverage_id='38400000-8cf0-11bd-b23e-10b96e4ef00d', id='38400000-8cf0-11bd-b23e-10b96e4ef00d'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
