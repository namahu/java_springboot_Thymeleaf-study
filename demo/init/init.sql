-- サンプルテーブルの作成
CREATE TABLE IF NOT EXISTS tasks (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50) NOT NULL DEFAULT '未着手',
    due_date TIMESTAMP DEFAULT NULL,
    is_completed BOOLEAN DEFAULT FALSE,
    is_deleted BOOLEAN DEFAULT FALSE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT NULL,
    deleted_at TIMESTAMP DEFAULT NULL
);

-- サンプルデータの挿入
INSERT INTO tasks (title) VALUES
    ('task1'),
    ('task2'),
    ('task3');

-- インデックスの作成
CREATE INDEX idx_tasks_title ON tasks(title);
