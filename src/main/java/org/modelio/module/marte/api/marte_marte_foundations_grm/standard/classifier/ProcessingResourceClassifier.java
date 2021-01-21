/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << ProcessingResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c3c64e0c-b995-4bfa-a118-a45f909694e2")
public class ProcessingResourceClassifier extends ResourceClassifier {
    @objid ("183b0b00-9750-4736-8f29-b31fd7a483be")
    public static final String STEREOTYPE_NAME = "ProcessingResource_Classifier";

    @objid ("83a01d0a-c253-4aa1-b3c2-609388b4868b")
    public static final String PROCESSINGRESOURCE_CLASSIFIER_MAINSCHEDULER_TAGTYPE = "ProcessingResource_Classifier_mainScheduler";

    @objid ("8ac8b8b5-5e4e-4783-aed8-866870334b75")
    public static final String PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR_TAGTYPE = "ProcessingResource_Classifier_speedFactor";

    /**
     * Tells whether a {@link ProcessingResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << ProcessingResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d9d9fca9-3010-4e23-aeb5-ead8cc0a42e4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << ProcessingResource_Classifier >> then instantiate a {@link ProcessingResourceClassifier} proxy.
     * 
     * @return a {@link ProcessingResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("09f945bc-b10d-43ec-a58a-4f9a6873009a")
    public static ProcessingResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceClassifier.STEREOTYPE_NAME);
        return ProcessingResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceClassifier} proxy from a {@link Classifier} stereotyped << ProcessingResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link ProcessingResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("98a48171-843e-43fb-8709-9c2c861f976c")
    public static ProcessingResourceClassifier instantiate(final Classifier obj) {
        return ProcessingResourceClassifier.canInstantiate(obj) ? new ProcessingResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceClassifier} proxy from a {@link Classifier} stereotyped << ProcessingResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link ProcessingResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0d277534-30a7-4554-95d8-7a026b498dba")
    public static ProcessingResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (ProcessingResourceClassifier.canInstantiate(obj))
        	return new ProcessingResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("ProcessingResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3afee700-d68d-4f36-a707-8b25e90cc060")
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
        ProcessingResourceClassifier other = (ProcessingResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("9379ec7f-fef1-45f5-b8c1-c0a27ffef696")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'ProcessingResource_Classifier_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("951338ba-8401-4606-b493-ab7d58eaa9b9")
    public String getProcessingResource_Classifier_mainScheduler() {
        return this.elt.getTagValue(ProcessingResourceClassifier.MdaTypes.PROCESSINGRESOURCE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ProcessingResource_Classifier_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("00acfda8-38c5-4ef0-a1b7-8a9a36d335ed")
    public String getProcessingResource_Classifier_speedFactor() {
        return this.elt.getTagValue(ProcessingResourceClassifier.MdaTypes.PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("59d328ac-8d2f-44e8-b96d-8b6ae9b171c8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ProcessingResource_Classifier_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6f917685-c3c9-4f35-9510-38310330b5ed")
    public void setProcessingResource_Classifier_mainScheduler(final String value) {
        this.elt.putTagValue(ProcessingResourceClassifier.MdaTypes.PROCESSINGRESOURCE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ProcessingResource_Classifier_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c7584f4d-5a5e-47f4-bf4c-2ef853e72b19")
    public void setProcessingResource_Classifier_speedFactor(final String value) {
        this.elt.putTagValue(ProcessingResourceClassifier.MdaTypes.PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("a17f0879-1fc0-4c4f-9574-e403c277c246")
    protected ProcessingResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("c5409503-7816-4e32-ab96-bb9e837ed6bb")
    public static final class MdaTypes {
        @objid ("763043e6-9fd5-46ff-92fd-9d189e49ed0a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("62117f31-6709-4198-aaf6-c9b9ded32d0e")
        public static TagType PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("f2e752ba-7f13-48ed-bb6a-c5cffacda5fd")
        public static TagType PROCESSINGRESOURCE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("cd9246ac-aa7c-42b1-bf18-224e1b3f5d41")
        private static Stereotype MDAASSOCDEP;

        @objid ("6e89f925-3237-4b79-a145-aa5ba9cf8168")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2989f609-9156-4b58-90e1-7d2006f2c910")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b0fe38af-1018-11df-86fe-0014222a9f79");
            PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c12e0411-1018-11df-86fe-0014222a9f79");
            PROCESSINGRESOURCE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c12e0412-1018-11df-86fe-0014222a9f79");
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
