SELECT S1.event_id, S1.session_id AS session1, S2.session_id AS session2
FROM Sessions S1
JOIN Sessions S2 ON S1.event_id = S2.event_id
  AND S1.session_id < S2.session_id
  AND S1.end_time > S2.start_time
  AND S1.start_time < S2.end_time;
