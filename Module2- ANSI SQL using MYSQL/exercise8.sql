SELECT E.title, COUNT(S.session_id) AS session_count
FROM Events E
LEFT JOIN Sessions S ON E.event_id = S.event_id
WHERE E.status = 'upcoming'
GROUP BY E.event_id;
