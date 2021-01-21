/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << DataPool_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("309d1048-4957-4482-a1b8-0dba7aa02532")
public class DataPoolAttribute {
    @objid ("9808e470-65ac-4838-994a-c591dcad8c02")
    public static final String STEREOTYPE_NAME = "DataPool_Attribute";

    @objid ("05dbf578-1a1e-4512-95ec-b0499db8acda")
    public static final String DATAPOOL_ATTRIBUTE_INSERTION_TAGTYPE = "DataPool_Attribute_insertion";

    @objid ("d5afa0a6-7aa1-422f-b3e9-713500176379")
    public static final String DATAPOOL_ATTRIBUTE_ORDERING_TAGTYPE = "DataPool_Attribute_ordering";

    @objid ("5dbe3aeb-8c0d-4add-8bc7-3969e9aac162")
    public static final String DATAPOOL_ATTRIBUTE_SELECTION_TAGTYPE = "DataPool_Attribute_selection";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("a45befd0-14cf-426e-8e87-f5ab7b4f3800")
    protected final Attribute elt;

    /**
     * Tells whether a {@link DataPoolAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << DataPool_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e87d8807-3081-4a65-8240-424b6e73e6b1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DataPoolAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << DataPool_Attribute >> then instantiate a {@link DataPoolAttribute} proxy.
     * 
     * @return a {@link DataPoolAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("0b96074f-5a12-46d8-8abb-a65fb78ea1cb")
    public static DataPoolAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DataPoolAttribute.STEREOTYPE_NAME);
        return DataPoolAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link DataPoolAttribute} proxy from a {@link Attribute} stereotyped << DataPool_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link DataPoolAttribute} proxy or <i>null</i>.
     */
    @objid ("210e0325-0261-4bc2-8d1e-dba932037c32")
    public static DataPoolAttribute instantiate(final Attribute obj) {
        return DataPoolAttribute.canInstantiate(obj) ? new DataPoolAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataPoolAttribute} proxy from a {@link Attribute} stereotyped << DataPool_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link DataPoolAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6b8db679-b535-4503-8fb9-3773d4153dbd")
    public static DataPoolAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (DataPoolAttribute.canInstantiate(obj))
        	return new DataPoolAttribute(obj);
        else
        	throw new IllegalArgumentException("DataPoolAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("68f4961d-7211-4029-ac18-2746e98799ca")
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
        DataPoolAttribute other = (DataPoolAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DataPool_Attribute_insertion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("11c81999-bccb-4257-a206-9c71dc74e3ed")
    public String getDataPool_Attribute_insertion() {
        return this.elt.getTagValue(DataPoolAttribute.MdaTypes.DATAPOOL_ATTRIBUTE_INSERTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'DataPool_Attribute_ordering'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a4aa27b4-0e9c-4de2-bac5-9bfb4aaac954")
    public String getDataPool_Attribute_ordering() {
        return this.elt.getTagValue(DataPoolAttribute.MdaTypes.DATAPOOL_ATTRIBUTE_ORDERING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'DataPool_Attribute_selection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7d214468-a07d-4886-9822-9abb6a29e605")
    public String getDataPool_Attribute_selection() {
        return this.elt.getTagValue(DataPoolAttribute.MdaTypes.DATAPOOL_ATTRIBUTE_SELECTION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("f45bbdb8-82bb-4140-831c-ce77bbefa131")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("01aa42f2-c9c7-4d90-a544-bf8d50d9f68d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'DataPool_Attribute_insertion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e823139c-cabb-462f-b43b-ab3f5a843e72")
    public void setDataPool_Attribute_insertion(final String value) {
        this.elt.putTagValue(DataPoolAttribute.MdaTypes.DATAPOOL_ATTRIBUTE_INSERTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'DataPool_Attribute_ordering'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e27e49e9-8ab7-4e73-8580-1c020c70033f")
    public void setDataPool_Attribute_ordering(final String value) {
        this.elt.putTagValue(DataPoolAttribute.MdaTypes.DATAPOOL_ATTRIBUTE_ORDERING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'DataPool_Attribute_selection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c9ff84a1-c6dc-492f-aa6a-a530ebba8a61")
    public void setDataPool_Attribute_selection(final String value) {
        this.elt.putTagValue(DataPoolAttribute.MdaTypes.DATAPOOL_ATTRIBUTE_SELECTION_TAGTYPE_ELT, value);
    }

    @objid ("bd32fdbd-9478-4c0a-8951-52ec3e4103f5")
    protected DataPoolAttribute(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("6de9965b-bdec-4a36-a53e-e3c892096a13")
    public static final class MdaTypes {
        @objid ("ec42a173-6c8c-4778-b4b5-e95593558dd4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d30ca151-0db8-4c03-a525-6374dd920175")
        public static TagType DATAPOOL_ATTRIBUTE_ORDERING_TAGTYPE_ELT;

        @objid ("c4fcef29-9c58-46d2-be97-ccca2bea5493")
        public static TagType DATAPOOL_ATTRIBUTE_INSERTION_TAGTYPE_ELT;

        @objid ("00276cba-e2aa-4f76-b4fb-699469018afc")
        public static TagType DATAPOOL_ATTRIBUTE_SELECTION_TAGTYPE_ELT;

        @objid ("a29f8180-6746-4edb-bc8e-cf0f22a16737")
        private static Stereotype MDAASSOCDEP;

        @objid ("318f96e1-4824-48b3-853c-716430a7d255")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dbdd15e9-346a-4834-bbff-4380a7ae1afb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "02644252-0ccf-11df-8525-001302895b2b");
            DATAPOOL_ATTRIBUTE_ORDERING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02644256-0ccf-11df-8525-001302895b2b");
            DATAPOOL_ATTRIBUTE_INSERTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0264425a-0ccf-11df-8525-001302895b2b");
            DATAPOOL_ATTRIBUTE_SELECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0264425e-0ccf-11df-8525-001302895b2b");
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
