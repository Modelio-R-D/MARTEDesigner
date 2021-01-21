/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << ProcessingResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b4f33dc3-87bf-4a82-b849-15bd3b1b5c0b")
public class ProcessingResourceAttribute extends ResourceAttribute {
    @objid ("d3e7a3e6-f2ab-4716-b701-841d774937b8")
    public static final String STEREOTYPE_NAME = "ProcessingResource_Attribute";

    @objid ("559b244d-e9ee-490b-9f8b-45752898946b")
    public static final String PROCESSINGRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE = "ProcessingResource_Attribute_mainScheduler";

    @objid ("cc8803f1-f623-4971-90a6-d8a92ff5d875")
    public static final String PROCESSINGRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE = "ProcessingResource_Attribute_speedFactor";

    /**
     * Tells whether a {@link ProcessingResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << ProcessingResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("70e512b0-72d0-4bf4-9d47-abc6db545648")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << ProcessingResource_Attribute >> then instantiate a {@link ProcessingResourceAttribute} proxy.
     * 
     * @return a {@link ProcessingResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("5d81f5dd-7217-4754-aac4-f499ff14c625")
    public static ProcessingResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceAttribute.STEREOTYPE_NAME);
        return ProcessingResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceAttribute} proxy from a {@link Attribute} stereotyped << ProcessingResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link ProcessingResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("aeac3ca2-4114-4c16-9fc9-f99d16211b04")
    public static ProcessingResourceAttribute instantiate(final Attribute obj) {
        return ProcessingResourceAttribute.canInstantiate(obj) ? new ProcessingResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceAttribute} proxy from a {@link Attribute} stereotyped << ProcessingResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link ProcessingResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5546015a-21c9-4c4f-839c-c156bcfb7efe")
    public static ProcessingResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (ProcessingResourceAttribute.canInstantiate(obj))
        	return new ProcessingResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("ProcessingResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2ad7628e-ff6c-45ad-8549-60b68afdb55d")
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
        ProcessingResourceAttribute other = (ProcessingResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("0786cd7e-e0ee-45b5-a02a-ef080fde2622")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'ProcessingResource_Attribute_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bc3b194b-90bb-4fbc-9026-0426f5682d75")
    public String getProcessingResource_Attribute_mainScheduler() {
        return this.elt.getTagValue(ProcessingResourceAttribute.MdaTypes.PROCESSINGRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ProcessingResource_Attribute_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1266898c-0208-4254-8ffd-7e90f3fe815f")
    public String getProcessingResource_Attribute_speedFactor() {
        return this.elt.getTagValue(ProcessingResourceAttribute.MdaTypes.PROCESSINGRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("8d0936b3-8d32-4e42-a558-3ce5c2148c77")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ProcessingResource_Attribute_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("078305f8-256d-4675-a65b-d1ae09a309d9")
    public void setProcessingResource_Attribute_mainScheduler(final String value) {
        this.elt.putTagValue(ProcessingResourceAttribute.MdaTypes.PROCESSINGRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ProcessingResource_Attribute_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6884111b-1e66-4700-bd9a-34c02c1c0ad3")
    public void setProcessingResource_Attribute_speedFactor(final String value) {
        this.elt.putTagValue(ProcessingResourceAttribute.MdaTypes.PROCESSINGRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("92600142-9a55-4b12-8ee2-640b877b18ed")
    protected ProcessingResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("11122732-9f3e-4255-98ab-6bea7a734b98")
    public static final class MdaTypes {
        @objid ("e637756a-d1e6-4a1a-a2f0-dd9d327a2030")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("51a1be3b-312c-42fc-a997-d01d5769b1a9")
        public static TagType PROCESSINGRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("7ba1457b-fa3c-4907-9f58-4a6f0be6421e")
        public static TagType PROCESSINGRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("1ca07b04-4562-4f0c-bad3-33eea3d75303")
        private static Stereotype MDAASSOCDEP;

        @objid ("9a57bcaf-c933-4034-a32c-295c480799a4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cfe0ec96-88ba-4a75-9d64-8dd0e166aea9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00935dd8-0ccf-11df-8525-001302895b2b");
            PROCESSINGRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00935ddf-0ccf-11df-8525-001302895b2b");
            PROCESSINGRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00935de6-0ccf-11df-8525-001302895b2b");
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
