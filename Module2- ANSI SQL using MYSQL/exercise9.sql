SELECT U.full_name AS organizer_name, E.status, COUNT(*) AS event_count
FROM Events E
JOIN Users U ON E.organizer_id = U.user_id
GROUP BY E.organizer_id, E.status;
