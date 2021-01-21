/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SharedDataComResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3a0c3707-f2e3-40f5-bed4-858eefc8dd28")
public class SharedDataComResourceClassifier extends SwCommunicationResourceClassifier {
    @objid ("188c88d9-5209-4a5d-b6ef-79c99df0ce9b")
    public static final String STEREOTYPE_NAME = "SharedDataComResource_Classifier";

    @objid ("f73a183a-670d-4962-9aef-63cb9ecaec85")
    public static final String SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES_TAGTYPE = "SharedDataComResource_Classifier_readServices";

    @objid ("3bbd1f3d-d4a8-4ef6-9a3e-c04bb84b3ee0")
    public static final String SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES_TAGTYPE = "SharedDataComResource_Classifier_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SharedDataComResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("657bfab2-46e2-42b2-97b7-98d1fcbe2606")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SharedDataComResource_Classifier >> then instantiate a {@link SharedDataComResourceClassifier} proxy.
     * 
     * @return a {@link SharedDataComResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("49211a22-e376-43dc-a680-1f321f2f199c")
    public static SharedDataComResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceClassifier.STEREOTYPE_NAME);
        return SharedDataComResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceClassifier} proxy from a {@link Classifier} stereotyped << SharedDataComResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SharedDataComResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("93de85a7-cf54-4243-b0c9-1c3c11a34df0")
    public static SharedDataComResourceClassifier instantiate(final Classifier obj) {
        return SharedDataComResourceClassifier.canInstantiate(obj) ? new SharedDataComResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceClassifier} proxy from a {@link Classifier} stereotyped << SharedDataComResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SharedDataComResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("30915a8d-5420-4686-af0c-220474b98038")
    public static SharedDataComResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SharedDataComResourceClassifier.canInstantiate(obj))
        	return new SharedDataComResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e425ea5a-60f5-48e4-9c83-8fee9dc2b82c")
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
        SharedDataComResourceClassifier other = (SharedDataComResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("87abbe78-54f6-4b31-affd-40d861078c17")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Classifier_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("28968c8a-b0c1-451e-90c1-93843cba08f0")
    public List<String> getSharedDataComResource_Classifier_readServices() {
        return this.elt.getTagValues(SharedDataComResourceClassifier.MdaTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Classifier_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("02d3b16d-d411-4e0e-b5f9-b5b133faa6c5")
    public List<String> getSharedDataComResource_Classifier_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceClassifier.MdaTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES_TAGTYPE_ELT);
    }

    @objid ("137d3a00-90fa-4f51-b81f-63f92a9698cf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Classifier_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("04892df1-6d45-4a71-b34b-90df0a9cc299")
    public void setSharedDataComResource_Classifier_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceClassifier.MdaTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Classifier_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3d7c7314-ee08-4b8f-bb43-1851d8546537")
    public void setSharedDataComResource_Classifier_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceClassifier.MdaTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("6380b5a8-f72a-45e2-9ae1-43b4957d9a13")
    protected SharedDataComResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("92674742-39f3-40f6-9198-f277a707a570")
    public static final class MdaTypes {
        @objid ("50921339-2784-4b65-94c6-4e54e3031e0a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("58ad91b7-feec-47be-a7d2-68e507d7f33e")
        public static TagType SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES_TAGTYPE_ELT;

        @objid ("f0ce1bf6-0891-4b99-b575-2bb20fbd03e1")
        public static TagType SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES_TAGTYPE_ELT;

        @objid ("f0e4a1ea-73a1-459c-a5f7-dfe925b6db8a")
        private static Stereotype MDAASSOCDEP;

        @objid ("f35d9c83-c325-41a6-9075-2de35ef5523d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d6fce237-efff-484f-ae33-ac6f6a5a0f01")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2dc3de00-10d8-11df-81d9-0014222a9f79");
            SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2dc3de01-10d8-11df-81d9-0014222a9f79");
            SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2dc3de02-10d8-11df-81d9-0014222a9f79");
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
