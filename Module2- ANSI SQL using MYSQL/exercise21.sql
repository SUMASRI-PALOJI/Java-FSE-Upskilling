SELECT U.full_name, COUNT(F.feedback_id) AS feedback_count
FROM Feedback F
JOIN Users U ON F.user_id = U.user_id
GROUP BY F.user_id
ORDER BY feedback_count DESC,
LIMIT 5;
