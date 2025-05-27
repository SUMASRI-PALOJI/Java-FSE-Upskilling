SELECT U.full_name, E.title, E.city, E.start_date
FROM Users U
JOIN Registrations R ON U.user_id = R.user_id
JOIN Events E ON R.event_id = E.event_id
WHERE E.status = 'upcoming' AND U.city = E.city
ORDER BY E.start_date;
