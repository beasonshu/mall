package org.linlinjava.litemall.db.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class DiningHall {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dining_hall._id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dining_hall.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dining_hall.square
     *
     * @mbg.generated
     */
    private String square;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dining_hall.floors
     *
     * @mbg.generated
     */
    private String floors;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dining_hall.capacity
     *
     * @mbg.generated
     */
    private String capacity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dining_hall.thumbnail
     *
     * @mbg.generated
     */
    private String thumbnail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dining_hall.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dining_hall._id
     *
     * @return the value of dining_hall._id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dining_hall._id
     *
     * @param id the value for dining_hall._id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dining_hall.name
     *
     * @return the value of dining_hall.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dining_hall.name
     *
     * @param name the value for dining_hall.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dining_hall.square
     *
     * @return the value of dining_hall.square
     *
     * @mbg.generated
     */
    public String getSquare() {
        return square;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dining_hall.square
     *
     * @param square the value for dining_hall.square
     *
     * @mbg.generated
     */
    public void setSquare(String square) {
        this.square = square;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dining_hall.floors
     *
     * @return the value of dining_hall.floors
     *
     * @mbg.generated
     */
    public String getFloors() {
        return floors;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dining_hall.floors
     *
     * @param floors the value for dining_hall.floors
     *
     * @mbg.generated
     */
    public void setFloors(String floors) {
        this.floors = floors;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dining_hall.capacity
     *
     * @return the value of dining_hall.capacity
     *
     * @mbg.generated
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dining_hall.capacity
     *
     * @param capacity the value for dining_hall.capacity
     *
     * @mbg.generated
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dining_hall.thumbnail
     *
     * @return the value of dining_hall.thumbnail
     *
     * @mbg.generated
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dining_hall.thumbnail
     *
     * @param thumbnail the value for dining_hall.thumbnail
     *
     * @mbg.generated
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dining_hall.description
     *
     * @return the value of dining_hall.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dining_hall.description
     *
     * @param description the value for dining_hall.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", square=").append(square);
        sb.append(", floors=").append(floors);
        sb.append(", capacity=").append(capacity);
        sb.append(", thumbnail=").append(thumbnail);
        sb.append(", description=").append(description);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DiningHall other = (DiningHall) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSquare() == null ? other.getSquare() == null : this.getSquare().equals(other.getSquare()))
            && (this.getFloors() == null ? other.getFloors() == null : this.getFloors().equals(other.getFloors()))
            && (this.getCapacity() == null ? other.getCapacity() == null : this.getCapacity().equals(other.getCapacity()))
            && (this.getThumbnail() == null ? other.getThumbnail() == null : this.getThumbnail().equals(other.getThumbnail()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSquare() == null) ? 0 : getSquare().hashCode());
        result = prime * result + ((getFloors() == null) ? 0 : getFloors().hashCode());
        result = prime * result + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        result = prime * result + ((getThumbnail() == null) ? 0 : getThumbnail().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    public enum Column {
        id("_id", "id", "INTEGER", false),
        name("name", "name", "VARCHAR", true),
        square("square", "square", "VARCHAR", false),
        floors("floors", "floors", "VARCHAR", false),
        capacity("capacity", "capacity", "VARCHAR", false),
        thumbnail("thumbnail", "thumbnail", "VARCHAR", false),
        description("description", "description", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dining_hall
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}