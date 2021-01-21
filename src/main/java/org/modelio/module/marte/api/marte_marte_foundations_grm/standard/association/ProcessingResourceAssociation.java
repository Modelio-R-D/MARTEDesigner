/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << ProcessingResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("61efb77c-cd33-4296-aeb2-9e97c9b04b49")
public class ProcessingResourceAssociation extends ResourceAssociation {
    @objid ("de5c99a5-2bda-4e5e-9a75-f4cab27215da")
    public static final String STEREOTYPE_NAME = "ProcessingResource_Association";

    @objid ("73230468-7ac3-43d5-88d6-36869bf8a511")
    public static final String PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE = "ProcessingResource_Association_mainScheduler";

    @objid ("d45bf481-7f63-4970-830c-1b9e472f27af")
    public static final String PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE = "ProcessingResource_Association_speedFactor";

    /**
     * Tells whether a {@link ProcessingResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << ProcessingResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("43bb3532-ab01-4378-91cf-1a9e75b006c9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << ProcessingResource_Association >> then instantiate a {@link ProcessingResourceAssociation} proxy.
     * 
     * @return a {@link ProcessingResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("a91b0840-e01d-4718-bcce-e67873b20fbb")
    public static ProcessingResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceAssociation.STEREOTYPE_NAME);
        return ProcessingResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceAssociation} proxy from a {@link Association} stereotyped << ProcessingResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link ProcessingResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("61d591e9-fd35-4ed4-8481-170f3c57bc7c")
    public static ProcessingResourceAssociation instantiate(final Association obj) {
        return ProcessingResourceAssociation.canInstantiate(obj) ? new ProcessingResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceAssociation} proxy from a {@link Association} stereotyped << ProcessingResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link ProcessingResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("da40aada-9393-4e71-aca7-a7e136538533")
    public static ProcessingResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (ProcessingResourceAssociation.canInstantiate(obj))
        	return new ProcessingResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("ProcessingResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("95bf4fce-fa15-4efe-a04b-ebb33aa74822")
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
        ProcessingResourceAssociation other = (ProcessingResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("cf376c10-a15d-48f1-b219-f1098831528f")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'ProcessingResource_Association_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("138ab43a-3653-443f-98ea-1381cf2b647e")
    public String getProcessingResource_Association_mainScheduler() {
        return this.elt.getTagValue(ProcessingResourceAssociation.MdaTypes.PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ProcessingResource_Association_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a663f45-1592-4914-b9fd-08d066a9ce47")
    public String getProcessingResource_Association_speedFactor() {
        return this.elt.getTagValue(ProcessingResourceAssociation.MdaTypes.PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("aaad0401-a346-4313-a0a4-ea16167ccf81")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ProcessingResource_Association_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e70522fd-eac8-419a-a0b9-c5163d9e1d6d")
    public void setProcessingResource_Association_mainScheduler(final String value) {
        this.elt.putTagValue(ProcessingResourceAssociation.MdaTypes.PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ProcessingResource_Association_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ca1c0b3c-0211-4e29-adc1-b49d04e8084c")
    public void setProcessingResource_Association_speedFactor(final String value) {
        this.elt.putTagValue(ProcessingResourceAssociation.MdaTypes.PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("c0347325-c434-4f5e-81ba-6bfdcbf700a9")
    protected ProcessingResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("0e9da706-5ce7-40bb-a185-ec0dcea886af")
    public static final class MdaTypes {
        @objid ("edf04f3a-2310-4333-96fc-f5bc49334339")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a6541dcd-c7b5-4275-9703-a9b956d3f733")
        public static TagType PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("dbe03606-3111-43ef-97e7-7e77e6070ec0")
        public static TagType PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("5178497a-cdb6-48ee-9d21-206d90f47ca9")
        private static Stereotype MDAASSOCDEP;

        @objid ("d9eb4b0c-1e66-4ca7-921f-8091d036a3af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ef2006a9-d2a9-470e-8f0b-7b579a974e14")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9f8a2be5-1018-11df-86fe-0014222a9f79");
            PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bf2d67f6-1018-11df-86fe-0014222a9f79");
            PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bf2d67f7-1018-11df-86fe-0014222a9f79");
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
