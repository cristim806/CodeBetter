CREATE TABLE IF NOT EXISTS student_course (
   student_id VARCHAR(100) NOT NULL,
   course_id VARCHAR(100) NOT NULL
--   start_date DATE NOT NULL,
--   end_date DATE NOT NULL,
--   grade INTEGER CHECK (grade >= 0 AND grade <= 100),
--   UNIQUE (student_id, course_id)
);