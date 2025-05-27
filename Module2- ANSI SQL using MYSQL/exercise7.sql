SELECT U.full_name, E.title AS event_title, F.rating, F.comments
FROM Feedback F
JOIN Users U ON F.user_id = U.user_id
JOIN Events E ON F.event_id = E.event_id
WHERE F.rating < 3;
