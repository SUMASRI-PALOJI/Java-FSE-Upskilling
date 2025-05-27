SELECT E.title, AVG(F.rating) AS avg_rating, COUNT(F.feedback_id) AS feedback_count
FROM Events E
JOIN Feedback F ON E.event_id = F.event_id
GROUP BY E.event_id
HAVING COUNT(F.feedback_id) >= 10
ORDER BY avg_rating DESC;
