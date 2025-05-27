SELECT U.city, COUNT(DISTINCT R.user_id) AS user_count
FROM Users U
JOIN Registrations R ON U.user_id = R.user_id
GROUP BY U.city
ORDER BY user_count DESC
LIMIT 5;
