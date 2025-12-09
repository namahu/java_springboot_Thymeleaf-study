-- サンプルテーブルの作成
CREATE TABLE IF NOT EXISTS tasks (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50) NOT NULL DEFAULT '未着手',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- サンプルデータの挿入
INSERT INTO tasks (title) VALUES
    ('task1'),
    ('task2'),
    ('task3');

-- インデックスの作成
CREATE INDEX idx_tasks_title ON tasks(title);
