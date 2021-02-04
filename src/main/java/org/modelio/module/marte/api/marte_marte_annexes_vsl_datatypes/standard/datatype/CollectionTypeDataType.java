/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("25be6069-815f-41b6-92a7-10b16d609f17")
    public static final String STEREOTYPE_NAME = "CollectionType_DataType";

    @objid ("5cd72f33-babe-4f35-ac09-afcdb4388dbf")
    public static final String COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB_TAGTYPE = "CollectionType_DataType_collectionAttrib";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("176cbfcd-0374-417d-9a1b-3ce97c14b84d")
    protected final DataType elt;

    /**
     * Tells whether a {@link CollectionTypeDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << CollectionType_DataType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("60e1395f-346f-4f55-81c1-66c6ecc2f90d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CollectionTypeDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << CollectionType_DataType >> then instantiate a {@link CollectionTypeDataType} proxy.
     * 
     * @return a {@link CollectionTypeDataType} proxy on the created {@link DataType}.
     */
    @objid ("a8246cd4-62e1-4a6b-a436-25a25e8f0714")
    public static CollectionTypeDataType create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CollectionTypeDataType.STEREOTYPE_NAME);
        return CollectionTypeDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link CollectionTypeDataType} proxy from a {@link DataType} stereotyped << CollectionType_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link CollectionTypeDataType} proxy or <i>null</i>.
     */
    @objid ("3c10bb8f-8c79-4fe9-907b-94109ef05e78")
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
    @objid ("5442dd2f-2afd-4b58-ac89-d47132670701")
    public static CollectionTypeDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (CollectionTypeDataType.canInstantiate(obj))
        	return new CollectionTypeDataType(obj);
        else
        	throw new IllegalArgumentException("CollectionTypeDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3848b7b7-8742-47fe-b26a-dcf8af463290")
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
    @objid ("c69ee25a-f2c3-4878-95ca-398c8ea57495")
    public String getCollectionType_DataType_collectionAttrib() {
        return this.elt.getTagValue(CollectionTypeDataType.MdaTypes.COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("0080ee8a-b526-4283-9f0c-36cde3025a85")
    public DataType getElement() {
        return this.elt;
    }

    @objid ("b7774760-1120-4312-b4ba-541591b5845b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CollectionType_DataType_collectionAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("67289650-60f8-4ae3-b0cf-efd7e6f630b7")
    public void setCollectionType_DataType_collectionAttrib(final String value) {
        this.elt.putTagValue(CollectionTypeDataType.MdaTypes.COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB_TAGTYPE_ELT, value);
    }

    @objid ("0dfdb4ee-5f2f-49a2-856d-9831c071f192")
    protected CollectionTypeDataType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("74de3e74-dbdf-46f7-a9a3-a5721484d041")
    public static final class MdaTypes {
        @objid ("afaf1b4e-d2a0-476b-9fcb-5de7b512b6e4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a107f458-6886-4848-99e9-f7db4bdca068")
        public static TagType COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB_TAGTYPE_ELT;

        @objid ("73ae603d-b689-47af-a028-5c25d5405b93")
        private static Stereotype MDAASSOCDEP;

        @objid ("f20b65d7-1182-480c-a5b4-6ec2c9cfdb1d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f8e47015-4db0-4f7b-8659-a0fb9c560606")
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
