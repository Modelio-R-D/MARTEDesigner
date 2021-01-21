/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << TupleType_DataType >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("415a2036-5044-45f5-9c2d-e47d56741ed4")
public class TupleTypeDataType {
    @objid ("79af6e33-2123-47ca-b599-200b0e2649bd")
    public static final String STEREOTYPE_NAME = "TupleType_DataType";

    @objid ("da073c70-d4c6-4593-8c2c-219751ff1ec1")
    public static final String TUPLETYPE_DATATYPE_TUPLEATTRIB_TAGTYPE = "TupleType_DataType_tupleAttrib";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("34d9e017-48b4-4ea2-83d5-eb5b2355578c")
    protected final DataType elt;

    /**
     * Tells whether a {@link TupleTypeDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << TupleType_DataType >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1be2d278-195d-4cd8-9ddd-0d0caeaa98de")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TupleTypeDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << TupleType_DataType >> then instantiate a {@link TupleTypeDataType} proxy.
     * 
     * @return a {@link TupleTypeDataType} proxy on the created {@link DataType}.
     */
    @objid ("a3b6306c-9456-410b-924a-81ca3c62c52d")
    public static TupleTypeDataType create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("DataType");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TupleTypeDataType.STEREOTYPE_NAME);
        return TupleTypeDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link TupleTypeDataType} proxy from a {@link DataType} stereotyped << TupleType_DataType >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link TupleTypeDataType} proxy or <i>null</i>.
     */
    @objid ("d549219d-c50e-4c80-8e45-e1306965b3bf")
    public static TupleTypeDataType instantiate(final DataType obj) {
        return TupleTypeDataType.canInstantiate(obj) ? new TupleTypeDataType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TupleTypeDataType} proxy from a {@link DataType} stereotyped << TupleType_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link TupleTypeDataType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c16ef4e9-edbe-488d-a721-9fa274174f9a")
    public static TupleTypeDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (TupleTypeDataType.canInstantiate(obj))
        	return new TupleTypeDataType(obj);
        else
        	throw new IllegalArgumentException("TupleTypeDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("39da740a-d3ff-46f0-9021-cc2f1b8196d3")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TupleTypeDataType other = (TupleTypeDataType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("df4cd9cc-ca40-487d-97ab-a3c8e339b451")
    public DataType getElement() {
        return this.elt;
    }

    /**
     * Getter for List<String> property 'TupleType_DataType_tupleAttrib'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8875488f-6a59-432d-ad21-faf39240229d")
    public List<String> getTupleType_DataType_tupleAttrib() {
        return this.elt.getTagValues(TupleTypeDataType.MdaTypes.TUPLETYPE_DATATYPE_TUPLEATTRIB_TAGTYPE_ELT);
    }

    @objid ("6990381e-ce90-4d3b-ab4e-202ad30fb947")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'TupleType_DataType_tupleAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0fd213d-eb03-4bd0-8e86-42dc7ed425cc")
    public void setTupleType_DataType_tupleAttrib(final List<String> values) {
        this.elt.putTagValues(TupleTypeDataType.MdaTypes.TUPLETYPE_DATATYPE_TUPLEATTRIB_TAGTYPE_ELT, values);
    }

    @objid ("17f3fcd1-9a39-4e27-9f4a-7438be68b5c1")
    protected TupleTypeDataType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("53139ba2-3421-40cb-b32c-8cfa66d5e2b8")
    public static final class MdaTypes {
        @objid ("6bbbe1f7-02b2-4c41-b258-bac6b7f67a35")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4002d9cb-3000-4f1e-b642-2a39da6a1fd6")
        public static TagType TUPLETYPE_DATATYPE_TUPLEATTRIB_TAGTYPE_ELT;

        @objid ("1d91431b-6382-4131-b6b9-0645778e2937")
        private static Stereotype MDAASSOCDEP;

        @objid ("1021abcd-fcdc-4363-8935-aeaba0611a10")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3c289e7f-b115-436f-9471-38b1db57a830")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9908613-0cce-11df-8525-001302895b2b");
            TUPLETYPE_DATATYPE_TUPLEATTRIB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9efe2e9-0cce-11df-8525-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
