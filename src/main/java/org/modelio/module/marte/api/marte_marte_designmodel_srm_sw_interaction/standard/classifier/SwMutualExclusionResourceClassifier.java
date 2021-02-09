/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << SwMutualExclusionResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwMutualExclusionResourceClassifier extends SwSynchronizationResourceClassifier {
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_Classifier";

    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_Classifier_accessTokenElements";

    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_Classifier_acquireServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE = "SwMutualExclusionResource_Classifier_ceiling";

    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Classifier_concurrentAccessProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE = "SwMutualExclusionResource_Classifier_mechanism";

    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Classifier_otherProtectProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_Classifier_protectKind";

    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_Classifier_releaseServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_Classifier_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SwMutualExclusionResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SwMutualExclusionResource_Classifier >> then instantiate a {@link SwMutualExclusionResourceClassifier} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceClassifier} proxy on the created {@link Classifier}.
     */
    public static SwMutualExclusionResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceClassifier.STEREOTYPE_NAME);
        return SwMutualExclusionResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceClassifier} proxy from a {@link Classifier} stereotyped << SwMutualExclusionResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SwMutualExclusionResourceClassifier} proxy or <i>null</i>.
     */
    public static SwMutualExclusionResourceClassifier instantiate(final Classifier obj) {
        return SwMutualExclusionResourceClassifier.canInstantiate(obj) ? new SwMutualExclusionResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceClassifier} proxy from a {@link Classifier} stereotyped << SwMutualExclusionResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SwMutualExclusionResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwMutualExclusionResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceClassifier.canInstantiate(obj))
        	return new SwMutualExclusionResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwMutualExclusionResourceClassifier other = (SwMutualExclusionResourceClassifier) obj;
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
     * Getter for List<String> property 'SwMutualExclusionResource_Classifier_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Classifier_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Classifier_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Classifier_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Classifier_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Classifier_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Classifier_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Classifier_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Classifier_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Classifier_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Classifier_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Classifier_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Classifier_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Classifier_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Classifier_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Classifier_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Classifier_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Classifier_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Classifier_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Classifier_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Classifier_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Classifier_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Classifier_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Classifier_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Classifier_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Classifier_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Classifier_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Classifier_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Classifier_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Classifier_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Classifier_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Classifier_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Classifier_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Classifier_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Classifier_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Classifier_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE_ELT, value);
    }

    protected SwMutualExclusionResourceClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "851a905d-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "851a905e-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "851a905f-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "851a9060-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "851a9061-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "851a9062-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e12d5ff2-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e12d8703-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e12d8704-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e12d8705-92ad-11e0-a69d-0027103f347c");
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
