SELECT E.title, COUNT(R.registration_id) AS total_registrations
FROM Events E
JOIN Registrations R ON E.event_id = R.event_id
GROUP BY E.event_id
ORDER BY total_registrations DESC
LIMIT 3;
