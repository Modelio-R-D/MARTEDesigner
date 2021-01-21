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
 * Proxy class to handle a {@link DataType} with << BoundedSubtype_DataType >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b33ef3bd-7d4f-42f4-81f5-ab3d9b607c9b")
public class BoundedSubtypeDataType {
    @objid ("ea38db28-79a7-413a-85ae-4cc84c10b2f8")
    public static final String STEREOTYPE_NAME = "BoundedSubtype_DataType";

    @objid ("f05acd16-d164-46da-a119-039a44d135c1")
    public static final String BOUNDEDSUBTYPE_DATATYPE_BASETYPE_TAGTYPE = "BoundedSubtype_DataType_baseType";

    @objid ("a0c7011b-4d8d-4fc5-b899-e3c1ba6da738")
    public static final String BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN_TAGTYPE = "BoundedSubtype_DataType_isMaxOpen";

    @objid ("95e63218-23cb-493c-bc0d-fc842e044fce")
    public static final String BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN_TAGTYPE = "BoundedSubtype_DataType_isMinOpen";

    @objid ("2910aa85-5998-4e10-ab89-49db60b3de66")
    public static final String BOUNDEDSUBTYPE_DATATYPE_MAXVALUE_TAGTYPE = "BoundedSubtype_DataType_maxValue";

    @objid ("7d129f3e-ff8f-4711-8890-f631ae7db319")
    public static final String BOUNDEDSUBTYPE_DATATYPE_MINVALUE_TAGTYPE = "BoundedSubtype_DataType_minValue";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("fdc533d8-87eb-4a31-8181-1ecb0a6d4f5e")
    protected final DataType elt;

    /**
     * Tells whether a {@link BoundedSubtypeDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << BoundedSubtype_DataType >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2b7b79dd-ba97-4a23-9dc9-01d62ae474d1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, BoundedSubtypeDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << BoundedSubtype_DataType >> then instantiate a {@link BoundedSubtypeDataType} proxy.
     * 
     * @return a {@link BoundedSubtypeDataType} proxy on the created {@link DataType}.
     */
    @objid ("bb9e68c9-9544-4777-a620-9ca4ecafcd58")
    public static BoundedSubtypeDataType create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("DataType");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, BoundedSubtypeDataType.STEREOTYPE_NAME);
        return BoundedSubtypeDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link BoundedSubtypeDataType} proxy from a {@link DataType} stereotyped << BoundedSubtype_DataType >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link BoundedSubtypeDataType} proxy or <i>null</i>.
     */
    @objid ("7c5833c1-a783-45a7-91a2-22878621ae69")
    public static BoundedSubtypeDataType instantiate(final DataType obj) {
        return BoundedSubtypeDataType.canInstantiate(obj) ? new BoundedSubtypeDataType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link BoundedSubtypeDataType} proxy from a {@link DataType} stereotyped << BoundedSubtype_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link BoundedSubtypeDataType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0030681f-ae3a-49e1-8a67-f4ec3be3f53e")
    public static BoundedSubtypeDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (BoundedSubtypeDataType.canInstantiate(obj))
        	return new BoundedSubtypeDataType(obj);
        else
        	throw new IllegalArgumentException("BoundedSubtypeDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8a1ef63d-99e1-455f-92ec-c87b1d5962e9")
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
        BoundedSubtypeDataType other = (BoundedSubtypeDataType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'BoundedSubtype_DataType_baseType'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fda4be53-eced-4beb-b1b6-158c97b32e09")
    public String getBoundedSubtype_DataType_baseType() {
        return this.elt.getTagValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_BASETYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'BoundedSubtype_DataType_maxValue'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a16c75e8-4f50-4273-b16c-2093872503c8")
    public String getBoundedSubtype_DataType_maxValue() {
        return this.elt.getTagValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_MAXVALUE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'BoundedSubtype_DataType_minValue'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c1472f77-6c8e-4f04-bc3d-57ff6d648e34")
    public String getBoundedSubtype_DataType_minValue() {
        return this.elt.getTagValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_MINVALUE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("c4666d6f-407c-4170-9c97-c2b60d8a075e")
    public DataType getElement() {
        return this.elt;
    }

    @objid ("ef107749-6586-493f-81eb-9abf27f08da7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'BoundedSubtype_DataType_isMaxOpen'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c85d3df1-8f7c-48eb-a354-a74f67820ad6")
    public boolean isBoundedSubtype_DataType_isMaxOpen() {
        return this.elt.isTagged(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'BoundedSubtype_DataType_isMinOpen'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ae3b8f26-e336-4d49-9544-0f77549f8c33")
    public boolean isBoundedSubtype_DataType_isMinOpen() {
        return this.elt.isTagged(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'BoundedSubtype_DataType_baseType'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8aebc976-ecf6-41e8-a279-2717ab5c5609")
    public void setBoundedSubtype_DataType_baseType(final String value) {
        this.elt.putTagValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_BASETYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'BoundedSubtype_DataType_isMaxOpen'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f8e4bc73-896c-4268-a53f-bd464e0c2789")
    public void setBoundedSubtype_DataType_isMaxOpen(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'BoundedSubtype_DataType_isMinOpen'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a398767f-6cd8-44cb-9491-625880a8ecf9")
    public void setBoundedSubtype_DataType_isMinOpen(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'BoundedSubtype_DataType_maxValue'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a598f450-14cb-41c5-9dd9-f4c832d46a63")
    public void setBoundedSubtype_DataType_maxValue(final String value) {
        this.elt.putTagValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_MAXVALUE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'BoundedSubtype_DataType_minValue'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d9cc11d4-b53d-4c09-ad25-01a7cdec5172")
    public void setBoundedSubtype_DataType_minValue(final String value) {
        this.elt.putTagValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_MINVALUE_TAGTYPE_ELT, value);
    }

    @objid ("2b3a0a92-9ef2-4262-9b80-0322768f54fd")
    protected BoundedSubtypeDataType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("5e2b1257-9336-4fd7-8f63-11f0078a6df1")
    public static final class MdaTypes {
        @objid ("640340cf-83dd-4a5b-b1bf-bac2c029164e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ef5130d0-9273-42a9-9607-199fec563b1f")
        public static TagType BOUNDEDSUBTYPE_DATATYPE_BASETYPE_TAGTYPE_ELT;

        @objid ("ecbdddcf-01fe-4dda-b41b-f765a8d819a7")
        public static TagType BOUNDEDSUBTYPE_DATATYPE_MINVALUE_TAGTYPE_ELT;

        @objid ("686c9cd0-b729-4841-b692-40ea12f7c093")
        public static TagType BOUNDEDSUBTYPE_DATATYPE_MAXVALUE_TAGTYPE_ELT;

        @objid ("4898da11-363f-4c8a-84e1-c25aece9b81a")
        public static TagType BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN_TAGTYPE_ELT;

        @objid ("b39fb4aa-4eee-4959-a9c0-ccaf4073a341")
        public static TagType BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN_TAGTYPE_ELT;

        @objid ("0494ad53-df4c-4ea0-bb08-f2e1022b1584")
        private static Stereotype MDAASSOCDEP;

        @objid ("d6fe4bba-8d04-4f43-ba42-510b93862951")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c0fee7c6-937d-4e43-ad15-ffeb2e5131db")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9ed8091-0cce-11df-8525-001302895b2b");
            BOUNDEDSUBTYPE_DATATYPE_BASETYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9ed8095-0cce-11df-8525-001302895b2b");
            BOUNDEDSUBTYPE_DATATYPE_MINVALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9ed8099-0cce-11df-8525-001302895b2b");
            BOUNDEDSUBTYPE_DATATYPE_MAXVALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9ed809d-0cce-11df-8525-001302895b2b");
            BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9ed80a1-0cce-11df-8525-001302895b2b");
            BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9ed80a5-0cce-11df-8525-001302895b2b");
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
