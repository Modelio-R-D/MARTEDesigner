/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << ProcessingResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a1c6c35c-be8d-4f60-8cc8-ccb65cec7bea")
public class ProcessingResourceLink extends ResourceLink {
    @objid ("ff9048da-8e2f-4fee-9376-756ecdb4e417")
    public static final String STEREOTYPE_NAME = "ProcessingResource_Link";

    @objid ("e3d4f241-c310-455b-86f3-9f1087ad109b")
    public static final String PROCESSINGRESOURCE_LINK_MAINSCHEDULER_TAGTYPE = "ProcessingResource_Link_mainScheduler";

    @objid ("6994e171-c004-43a7-8580-c7055525e039")
    public static final String PROCESSINGRESOURCE_LINK_SPEEDFACTOR_TAGTYPE = "ProcessingResource_Link_speedFactor";

    /**
     * Tells whether a {@link ProcessingResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << ProcessingResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d1e247f9-f775-4636-9572-542a7c0824e2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << ProcessingResource_Link >> then instantiate a {@link ProcessingResourceLink} proxy.
     * 
     * @return a {@link ProcessingResourceLink} proxy on the created {@link Link}.
     */
    @objid ("8a6040b3-4ce7-4d4a-8315-c64803edd4ae")
    public static ProcessingResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceLink.STEREOTYPE_NAME);
        return ProcessingResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceLink} proxy from a {@link Link} stereotyped << ProcessingResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link ProcessingResourceLink} proxy or <i>null</i>.
     */
    @objid ("beeef096-498e-477c-851a-dba5c87c48c5")
    public static ProcessingResourceLink instantiate(final Link obj) {
        return ProcessingResourceLink.canInstantiate(obj) ? new ProcessingResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceLink} proxy from a {@link Link} stereotyped << ProcessingResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link ProcessingResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("24e750e8-2b5d-431c-a17f-2cf04d90b97a")
    public static ProcessingResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (ProcessingResourceLink.canInstantiate(obj))
        	return new ProcessingResourceLink(obj);
        else
        	throw new IllegalArgumentException("ProcessingResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5a0d812b-43c8-4cb6-9b83-42dd8f046267")
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
        ProcessingResourceLink other = (ProcessingResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("0f17fc8b-54ed-409c-bf46-4662a2cb96c2")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'ProcessingResource_Link_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c643a7e-fe85-4f30-887d-3d339fd4a941")
    public String getProcessingResource_Link_mainScheduler() {
        return this.elt.getTagValue(ProcessingResourceLink.MdaTypes.PROCESSINGRESOURCE_LINK_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ProcessingResource_Link_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa53d4d9-be70-4dc8-950f-7952e1c81e87")
    public String getProcessingResource_Link_speedFactor() {
        return this.elt.getTagValue(ProcessingResourceLink.MdaTypes.PROCESSINGRESOURCE_LINK_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("11379f94-4de7-4966-98ba-3f96b826679b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ProcessingResource_Link_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1c3eb497-1d9f-42dd-9a71-4437d12eb29b")
    public void setProcessingResource_Link_mainScheduler(final String value) {
        this.elt.putTagValue(ProcessingResourceLink.MdaTypes.PROCESSINGRESOURCE_LINK_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ProcessingResource_Link_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b48be8b7-1c0d-4a5e-8c47-bf8f4cd1e5f9")
    public void setProcessingResource_Link_speedFactor(final String value) {
        this.elt.putTagValue(ProcessingResourceLink.MdaTypes.PROCESSINGRESOURCE_LINK_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("97f49513-c6c3-4cff-9c75-b02cf3d259a7")
    protected ProcessingResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("8ecebf9f-209b-42e3-9ad5-1d1d801793ac")
    public static final class MdaTypes {
        @objid ("d8da1ec1-194e-402d-8fc8-bf36e0e0ac44")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("db161518-e8cd-41c1-bc2e-836b0bf5ef10")
        public static TagType PROCESSINGRESOURCE_LINK_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("d546a3e1-c19e-44c5-b6ba-c8d05633e48e")
        public static TagType PROCESSINGRESOURCE_LINK_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("eddf1d0c-da15-4a4c-a131-be3322a00f4d")
        private static Stereotype MDAASSOCDEP;

        @objid ("15b0e2a3-fde6-49d0-acc1-0c05cde905e9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("184c5a37-fa3c-49a0-9dd6-2b8c0b583ae5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00935dda-0ccf-11df-8525-001302895b2b");
            PROCESSINGRESOURCE_LINK_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00935de1-0ccf-11df-8525-001302895b2b");
            PROCESSINGRESOURCE_LINK_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00935de8-0ccf-11df-8525-001302895b2b");
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
