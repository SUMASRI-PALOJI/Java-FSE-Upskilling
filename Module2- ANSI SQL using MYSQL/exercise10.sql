SELECT E.title
FROM Events E
WHERE E.event_id IN (SELECT event_id FROM Registrations)
AND E.event_id NOT IN (SELECT event_id FROM Feedback);
