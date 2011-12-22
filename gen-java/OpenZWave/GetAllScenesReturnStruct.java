/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package OpenZWave;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetAllScenesReturnStruct implements org.apache.thrift.TBase<GetAllScenesReturnStruct, GetAllScenesReturnStruct._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetAllScenesReturnStruct");

  private static final org.apache.thrift.protocol.TField RETVAL_FIELD_DESC = new org.apache.thrift.protocol.TField("retval", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField _SCENE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("_sceneIds", org.apache.thrift.protocol.TType.LIST, (short)2);

  public byte retval; // required
  public List<Byte> _sceneIds; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RETVAL((short)1, "retval"),
    _SCENE_IDS((short)2, "_sceneIds");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RETVAL
          return RETVAL;
        case 2: // _SCENE_IDS
          return _SCENE_IDS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RETVAL_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RETVAL, new org.apache.thrift.meta_data.FieldMetaData("retval", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields._SCENE_IDS, new org.apache.thrift.meta_data.FieldMetaData("_sceneIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetAllScenesReturnStruct.class, metaDataMap);
  }

  public GetAllScenesReturnStruct() {
  }

  public GetAllScenesReturnStruct(
    byte retval,
    List<Byte> _sceneIds)
  {
    this();
    this.retval = retval;
    setRetvalIsSet(true);
    this._sceneIds = _sceneIds;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetAllScenesReturnStruct(GetAllScenesReturnStruct other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.retval = other.retval;
    if (other.isSet_sceneIds()) {
      List<Byte> __this___sceneIds = new ArrayList<Byte>();
      for (Byte other_element : other._sceneIds) {
        __this___sceneIds.add(other_element);
      }
      this._sceneIds = __this___sceneIds;
    }
  }

  public GetAllScenesReturnStruct deepCopy() {
    return new GetAllScenesReturnStruct(this);
  }

  @Override
  public void clear() {
    setRetvalIsSet(false);
    this.retval = 0;
    this._sceneIds = null;
  }

  public byte getRetval() {
    return this.retval;
  }

  public GetAllScenesReturnStruct setRetval(byte retval) {
    this.retval = retval;
    setRetvalIsSet(true);
    return this;
  }

  public void unsetRetval() {
    __isset_bit_vector.clear(__RETVAL_ISSET_ID);
  }

  /** Returns true if field retval is set (has been assigned a value) and false otherwise */
  public boolean isSetRetval() {
    return __isset_bit_vector.get(__RETVAL_ISSET_ID);
  }

  public void setRetvalIsSet(boolean value) {
    __isset_bit_vector.set(__RETVAL_ISSET_ID, value);
  }

  public int get_sceneIdsSize() {
    return (this._sceneIds == null) ? 0 : this._sceneIds.size();
  }

  public java.util.Iterator<Byte> get_sceneIdsIterator() {
    return (this._sceneIds == null) ? null : this._sceneIds.iterator();
  }

  public void addTo_sceneIds(byte elem) {
    if (this._sceneIds == null) {
      this._sceneIds = new ArrayList<Byte>();
    }
    this._sceneIds.add(elem);
  }

  public List<Byte> get_sceneIds() {
    return this._sceneIds;
  }

  public GetAllScenesReturnStruct set_sceneIds(List<Byte> _sceneIds) {
    this._sceneIds = _sceneIds;
    return this;
  }

  public void unset_sceneIds() {
    this._sceneIds = null;
  }

  /** Returns true if field _sceneIds is set (has been assigned a value) and false otherwise */
  public boolean isSet_sceneIds() {
    return this._sceneIds != null;
  }

  public void set_sceneIdsIsSet(boolean value) {
    if (!value) {
      this._sceneIds = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RETVAL:
      if (value == null) {
        unsetRetval();
      } else {
        setRetval((Byte)value);
      }
      break;

    case _SCENE_IDS:
      if (value == null) {
        unset_sceneIds();
      } else {
        set_sceneIds((List<Byte>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RETVAL:
      return Byte.valueOf(getRetval());

    case _SCENE_IDS:
      return get_sceneIds();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RETVAL:
      return isSetRetval();
    case _SCENE_IDS:
      return isSet_sceneIds();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetAllScenesReturnStruct)
      return this.equals((GetAllScenesReturnStruct)that);
    return false;
  }

  public boolean equals(GetAllScenesReturnStruct that) {
    if (that == null)
      return false;

    boolean this_present_retval = true;
    boolean that_present_retval = true;
    if (this_present_retval || that_present_retval) {
      if (!(this_present_retval && that_present_retval))
        return false;
      if (this.retval != that.retval)
        return false;
    }

    boolean this_present__sceneIds = true && this.isSet_sceneIds();
    boolean that_present__sceneIds = true && that.isSet_sceneIds();
    if (this_present__sceneIds || that_present__sceneIds) {
      if (!(this_present__sceneIds && that_present__sceneIds))
        return false;
      if (!this._sceneIds.equals(that._sceneIds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(GetAllScenesReturnStruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    GetAllScenesReturnStruct typedOther = (GetAllScenesReturnStruct)other;

    lastComparison = Boolean.valueOf(isSetRetval()).compareTo(typedOther.isSetRetval());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRetval()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.retval, typedOther.retval);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSet_sceneIds()).compareTo(typedOther.isSet_sceneIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet_sceneIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this._sceneIds, typedOther._sceneIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // RETVAL
          if (field.type == org.apache.thrift.protocol.TType.BYTE) {
            this.retval = iprot.readByte();
            setRetvalIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // _SCENE_IDS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list12 = iprot.readListBegin();
              this._sceneIds = new ArrayList<Byte>(_list12.size);
              for (int _i13 = 0; _i13 < _list12.size; ++_i13)
              {
                byte _elem14; // required
                _elem14 = iprot.readByte();
                this._sceneIds.add(_elem14);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(RETVAL_FIELD_DESC);
    oprot.writeByte(this.retval);
    oprot.writeFieldEnd();
    if (this._sceneIds != null) {
      oprot.writeFieldBegin(_SCENE_IDS_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BYTE, this._sceneIds.size()));
        for (byte _iter15 : this._sceneIds)
        {
          oprot.writeByte(_iter15);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetAllScenesReturnStruct(");
    boolean first = true;

    sb.append("retval:");
    sb.append(this.retval);
    first = false;
    if (!first) sb.append(", ");
    sb.append("_sceneIds:");
    if (this._sceneIds == null) {
      sb.append("null");
    } else {
      sb.append(this._sceneIds);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
