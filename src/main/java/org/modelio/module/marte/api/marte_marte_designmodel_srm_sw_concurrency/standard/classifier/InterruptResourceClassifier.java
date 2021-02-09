/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
 * Proxy class to handle a {@link Classifier} with << InterruptResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class InterruptResourceClassifier extends SwConcurrentResourceClassifier {
    public static final String STEREOTYPE_NAME = "InterruptResource_Classifier";

    public static final String INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE_TAGTYPE = "InterruptResource_Classifier_isMaskable";

    public static final String INTERRUPTRESOURCE_CLASSIFIER_KIND_TAGTYPE = "InterruptResource_Classifier_kind";

    public static final String INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE = "InterruptResource_Classifier_maskElements";

    public static final String INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_Classifier_routineConnectServices";

    public static final String INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_Classifier_routineDisconnectServices";

    public static final String INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS_TAGTYPE = "InterruptResource_Classifier_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << InterruptResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << InterruptResource_Classifier >> then instantiate a {@link InterruptResourceClassifier} proxy.
     * 
     * @return a {@link InterruptResourceClassifier} proxy on the created {@link Classifier}.
     */
    public static InterruptResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceClassifier.STEREOTYPE_NAME);
        return InterruptResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link InterruptResourceClassifier} proxy from a {@link Classifier} stereotyped << InterruptResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link InterruptResourceClassifier} proxy or <i>null</i>.
     */
    public static InterruptResourceClassifier instantiate(final Classifier obj) {
        return InterruptResourceClassifier.canInstantiate(obj) ? new InterruptResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterruptResourceClassifier} proxy from a {@link Classifier} stereotyped << InterruptResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link InterruptResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static InterruptResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (InterruptResourceClassifier.canInstantiate(obj))
        	return new InterruptResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        InterruptResourceClassifier other = (InterruptResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_Classifier_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getInterruptResource_Classifier_kind() {
        return this.elt.getTagValue(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Classifier_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Classifier_maskElements() {
        return this.elt.getTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Classifier_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Classifier_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Classifier_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Classifier_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Classifier_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Classifier_vectorElements() {
        return this.elt.getTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_Classifier_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isInterruptResource_Classifier_isMaskable() {
        return this.elt.isTagged(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_Classifier_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Classifier_isMaskable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'InterruptResource_Classifier_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Classifier_kind(final String value) {
        this.elt.putTagValue(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Classifier_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Classifier_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Classifier_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Classifier_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Classifier_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Classifier_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Classifier_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Classifier_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    protected InterruptResourceClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_CLASSIFIER_KIND_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cbe02c27-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_CLASSIFIER_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbe02c28-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbe02c29-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbe02c2a-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbe02c2b-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbe02c2c-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbe02c2d-10d0-11df-81d9-0014222a9f79");
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
