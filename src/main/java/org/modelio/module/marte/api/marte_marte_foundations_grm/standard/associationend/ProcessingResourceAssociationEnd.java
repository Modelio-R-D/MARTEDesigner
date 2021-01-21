/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << ProcessingResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("47106891-afd6-4611-8cbc-294f9cc957a5")
public class ProcessingResourceAssociationEnd extends ResourceAssociationEnd {
    @objid ("ec9e0058-bbbe-4ec2-867b-f8126e9a01c2")
    public static final String STEREOTYPE_NAME = "ProcessingResource_AssociationEnd";

    @objid ("b1a98e75-4388-40e0-aa8e-ee25bab42809")
    public static final String PROCESSINGRESOURCE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE = "ProcessingResource_AssociationEnd_mainScheduler";

    @objid ("ad7ebc2f-6f1e-4873-a816-671ba9d719c5")
    public static final String PROCESSINGRESOURCE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE = "ProcessingResource_AssociationEnd_speedFactor";

    /**
     * Tells whether a {@link ProcessingResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << ProcessingResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9499096f-0406-479e-8136-5c5a6b3bf399")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << ProcessingResource_AssociationEnd >> then instantiate a {@link ProcessingResourceAssociationEnd} proxy.
     * 
     * @return a {@link ProcessingResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("18b92969-474e-4972-b8f7-fed3885a83ed")
    public static ProcessingResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceAssociationEnd.STEREOTYPE_NAME);
        return ProcessingResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << ProcessingResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link ProcessingResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("0db6229f-cfa9-4770-9637-b1fe4c29bc0c")
    public static ProcessingResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return ProcessingResourceAssociationEnd.canInstantiate(obj) ? new ProcessingResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << ProcessingResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link ProcessingResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b207e8c6-d4c1-4e6f-baaf-07fc894f814a")
    public static ProcessingResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (ProcessingResourceAssociationEnd.canInstantiate(obj))
        	return new ProcessingResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("ProcessingResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c0cde042-2e35-488e-a370-e99c70e75503")
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
        ProcessingResourceAssociationEnd other = (ProcessingResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("c82e644d-27ee-4f78-beeb-aea37cf2031c")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'ProcessingResource_AssociationEnd_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f4a74001-5749-4148-9b35-e7f2a72ad154")
    public String getProcessingResource_AssociationEnd_mainScheduler() {
        return this.elt.getTagValue(ProcessingResourceAssociationEnd.MdaTypes.PROCESSINGRESOURCE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ProcessingResource_AssociationEnd_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b7f3773-b43d-4b55-b81a-414c99a33921")
    public String getProcessingResource_AssociationEnd_speedFactor() {
        return this.elt.getTagValue(ProcessingResourceAssociationEnd.MdaTypes.PROCESSINGRESOURCE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("e4b55845-1489-4d41-b2a6-e1d6fdd495da")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ProcessingResource_AssociationEnd_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f6602139-d385-42da-9056-55e27272ed92")
    public void setProcessingResource_AssociationEnd_mainScheduler(final String value) {
        this.elt.putTagValue(ProcessingResourceAssociationEnd.MdaTypes.PROCESSINGRESOURCE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ProcessingResource_AssociationEnd_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("572d08c6-ecd1-4ade-920d-405558e85465")
    public void setProcessingResource_AssociationEnd_speedFactor(final String value) {
        this.elt.putTagValue(ProcessingResourceAssociationEnd.MdaTypes.PROCESSINGRESOURCE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("47561f79-c011-4cdc-8f46-58b88af44b1f")
    protected ProcessingResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("e3264753-8688-4b23-8358-319b94caf039")
    public static final class MdaTypes {
        @objid ("ae5a25f8-55a7-41b1-a66c-c4fbeadf86a2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("930827ee-e5aa-4bac-8b85-b0415547c510")
        public static TagType PROCESSINGRESOURCE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("f84a7a97-df0d-438d-8ee1-50ab2b5a8a61")
        public static TagType PROCESSINGRESOURCE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("58e3aeca-f093-48c1-a90c-d1ce74c85b2a")
        private static Stereotype MDAASSOCDEP;

        @objid ("ddb72810-1ebb-4ae7-af96-7bbae959a39d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dad7de90-3e82-4f94-98a5-8e89294906a8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0090fb9a-0ccf-11df-8525-001302895b2b");
            PROCESSINGRESOURCE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00935ddd-0ccf-11df-8525-001302895b2b");
            PROCESSINGRESOURCE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00935de4-0ccf-11df-8525-001302895b2b");
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
