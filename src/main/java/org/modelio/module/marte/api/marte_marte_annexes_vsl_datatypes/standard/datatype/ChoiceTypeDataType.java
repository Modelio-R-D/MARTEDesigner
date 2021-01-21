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
 * Proxy class to handle a {@link DataType} with << ChoiceType_DataType >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7b933719-df0d-4f02-b7e6-6db8782870cb")
public class ChoiceTypeDataType {
    @objid ("ab980e6e-d088-4283-ad02-bde756fb6d4d")
    public static final String STEREOTYPE_NAME = "ChoiceType_DataType";

    @objid ("571ad1a9-5621-409a-b0ec-922b429f4732")
    public static final String CHOICETYPE_DATATYPE_CHOICEATTRIB_TAGTYPE = "ChoiceType_DataType_choiceAttrib";

    @objid ("962e7988-6d23-408c-aca0-99d7d1f26372")
    public static final String CHOICETYPE_DATATYPE_DEFAULTATTRIB_TAGTYPE = "ChoiceType_DataType_defaultAttrib";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("fd0e9bb0-3e74-4d30-9f4e-cc38a4d952d3")
    protected final DataType elt;

    /**
     * Tells whether a {@link ChoiceTypeDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << ChoiceType_DataType >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4ac71325-d5fc-4348-8a1c-c5cc6fe94ab0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ChoiceTypeDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << ChoiceType_DataType >> then instantiate a {@link ChoiceTypeDataType} proxy.
     * 
     * @return a {@link ChoiceTypeDataType} proxy on the created {@link DataType}.
     */
    @objid ("0c4d45b7-0028-4c1f-9fa4-2aeea48aab31")
    public static ChoiceTypeDataType create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("DataType");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ChoiceTypeDataType.STEREOTYPE_NAME);
        return ChoiceTypeDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link ChoiceTypeDataType} proxy from a {@link DataType} stereotyped << ChoiceType_DataType >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link ChoiceTypeDataType} proxy or <i>null</i>.
     */
    @objid ("e6e2e2f9-a4f7-48b1-bf0a-95676cb75d7e")
    public static ChoiceTypeDataType instantiate(final DataType obj) {
        return ChoiceTypeDataType.canInstantiate(obj) ? new ChoiceTypeDataType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ChoiceTypeDataType} proxy from a {@link DataType} stereotyped << ChoiceType_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link ChoiceTypeDataType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("41c73ae8-c5db-4f4f-beef-fb168a180c86")
    public static ChoiceTypeDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (ChoiceTypeDataType.canInstantiate(obj))
        	return new ChoiceTypeDataType(obj);
        else
        	throw new IllegalArgumentException("ChoiceTypeDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5304c553-7863-428d-85ab-409e3f7aff91")
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
        ChoiceTypeDataType other = (ChoiceTypeDataType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'ChoiceType_DataType_choiceAttrib'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3c0e4dc2-2596-45f4-85d5-4319312cb737")
    public List<String> getChoiceType_DataType_choiceAttrib() {
        return this.elt.getTagValues(ChoiceTypeDataType.MdaTypes.CHOICETYPE_DATATYPE_CHOICEATTRIB_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ChoiceType_DataType_defaultAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("afb1e254-32fd-4e8f-bd5b-5b93d36c2898")
    public String getChoiceType_DataType_defaultAttrib() {
        return this.elt.getTagValue(ChoiceTypeDataType.MdaTypes.CHOICETYPE_DATATYPE_DEFAULTATTRIB_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("267658e0-c181-4130-b8bd-b5584497a546")
    public DataType getElement() {
        return this.elt;
    }

    @objid ("12c4a815-7a48-435c-8108-f47bb308ec9e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'ChoiceType_DataType_choiceAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ee48f594-42e3-4e08-9af2-49e61788cc5d")
    public void setChoiceType_DataType_choiceAttrib(final List<String> values) {
        this.elt.putTagValues(ChoiceTypeDataType.MdaTypes.CHOICETYPE_DATATYPE_CHOICEATTRIB_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'ChoiceType_DataType_defaultAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a255b0da-8a0b-4056-8935-d3a6534dafac")
    public void setChoiceType_DataType_defaultAttrib(final String value) {
        this.elt.putTagValue(ChoiceTypeDataType.MdaTypes.CHOICETYPE_DATATYPE_DEFAULTATTRIB_TAGTYPE_ELT, value);
    }

    @objid ("3cb9e120-f28f-4166-be98-da5ebbf51ea6")
    protected ChoiceTypeDataType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("6dd29edc-693d-4ea6-a676-d9b621eebd99")
    public static final class MdaTypes {
        @objid ("06f0ac83-ad23-423f-8648-d475f6a23014")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b8f6ef57-aa2f-41bc-a889-f407e5d44e6f")
        public static TagType CHOICETYPE_DATATYPE_CHOICEATTRIB_TAGTYPE_ELT;

        @objid ("e7cf1947-d48a-4de5-a7b8-7ee600e6b67b")
        public static TagType CHOICETYPE_DATATYPE_DEFAULTATTRIB_TAGTYPE_ELT;

        @objid ("87f0397f-14f0-4dee-817a-408faf49410f")
        private static Stereotype MDAASSOCDEP;

        @objid ("d75f7f4f-ded1-4a29-aafb-e702e5612fad")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8f93af79-2f51-4493-b600-452b582edf5e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9efe2ed-0cce-11df-8525-001302895b2b");
            CHOICETYPE_DATATYPE_CHOICEATTRIB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9efe2f1-0cce-11df-8525-001302895b2b");
            CHOICETYPE_DATATYPE_DEFAULTATTRIB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9efe2f5-0cce-11df-8525-001302895b2b");
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
