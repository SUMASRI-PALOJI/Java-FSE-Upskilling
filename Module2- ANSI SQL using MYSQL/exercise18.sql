SELECT E.title
FROM Events E
LEFT JOIN Resources R ON E.event_id = R.event_id
WHERE R.resource_id IS NULL;
