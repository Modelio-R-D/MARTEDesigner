/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link DataType} with << CollectionType_DataType >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a157b457-857d-46ff-aafe-971ff50d1080")
public class CollectionTypeDataType {
    @objid ("75773efa-7b33-416e-9e8d-40cfb2c59275")
    public static final String STEREOTYPE_NAME = "CollectionType_DataType";

    @objid ("0f75378b-6784-411f-b192-00a5ec5898dc")
    public static final String COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB_TAGTYPE = "CollectionType_DataType_collectionAttrib";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("f8435d1b-ff5d-4cbf-86e4-b0b1da1e8c9c")
    protected final DataType elt;

    /**
     * Tells whether a {@link CollectionTypeDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << CollectionType_DataType >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6ba1be76-2bcd-4a37-baa2-bb91652316d7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CollectionTypeDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << CollectionType_DataType >> then instantiate a {@link CollectionTypeDataType} proxy.
     * 
     * @return a {@link CollectionTypeDataType} proxy on the created {@link DataType}.
     */
    @objid ("343414db-521a-48cb-b44a-3f7985f6aa38")
    public static CollectionTypeDataType create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("DataType");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CollectionTypeDataType.STEREOTYPE_NAME);
        return CollectionTypeDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link CollectionTypeDataType} proxy from a {@link DataType} stereotyped << CollectionType_DataType >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link CollectionTypeDataType} proxy or <i>null</i>.
     */
    @objid ("8fd1160a-4578-468a-a6e7-009fa891594c")
    public static CollectionTypeDataType instantiate(final DataType obj) {
        return CollectionTypeDataType.canInstantiate(obj) ? new CollectionTypeDataType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CollectionTypeDataType} proxy from a {@link DataType} stereotyped << CollectionType_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link CollectionTypeDataType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("393c3156-cea6-461e-9ada-536a3af41878")
    public static CollectionTypeDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (CollectionTypeDataType.canInstantiate(obj))
        	return new CollectionTypeDataType(obj);
        else
        	throw new IllegalArgumentException("CollectionTypeDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("32d14cb1-8cdd-4157-9f6e-e981ada7e315")
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
        CollectionTypeDataType other = (CollectionTypeDataType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'CollectionType_DataType_collectionAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("701bc888-106e-4e12-ad96-6f03cdcb98ff")
    public String getCollectionType_DataType_collectionAttrib() {
        return this.elt.getTagValue(CollectionTypeDataType.MdaTypes.COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("605319a9-420c-4a8e-951f-36c944ce90ea")
    public DataType getElement() {
        return this.elt;
    }

    @objid ("3f93ec9d-899a-458d-a02f-5dcf4ac8c40a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CollectionType_DataType_collectionAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dec2927e-1d73-4c02-bdd1-a5929b72d43e")
    public void setCollectionType_DataType_collectionAttrib(final String value) {
        this.elt.putTagValue(CollectionTypeDataType.MdaTypes.COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB_TAGTYPE_ELT, value);
    }

    @objid ("09e220cc-d7f4-4ebc-bd42-36c39ebd1218")
    protected CollectionTypeDataType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("74de3e74-dbdf-46f7-a9a3-a5721484d041")
    public static final class MdaTypes {
        @objid ("008e6076-919b-4e26-b6ce-bd76bc290225")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("65094765-3195-40da-8473-f9edf916d3a7")
        public static TagType COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB_TAGTYPE_ELT;

        @objid ("4f53aa6f-713f-4fa9-a572-3ab23ff95106")
        private static Stereotype MDAASSOCDEP;

        @objid ("a2e74d0c-53ae-4ed7-917c-1ec6efef3c4e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("691fed6b-c995-4748-8859-a8d9d574d19e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9efe2e1-0cce-11df-8525-001302895b2b");
            COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9efe2e5-0cce-11df-8525-001302895b2b");
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
