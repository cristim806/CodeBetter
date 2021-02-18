CREATE TABLE IF NOT EXISTS student_to_courses (
   student_id UUID NOT NULL REFERENCES student (student_id),
   course_id UUID NOT NULL REFERENCES course (course_id)
);