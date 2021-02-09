/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << SchedulableResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SchedulableResourceClassifier extends ResourceClassifier {
    public static final String STEREOTYPE_NAME = "SchedulableResource_Classifier";

    public static final String SCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE = "SchedulableResource_Classifier_dependentScheduler";

    public static final String SCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE = "SchedulableResource_Classifier_host";

    public static final String SCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE = "SchedulableResource_Classifier_schedParams";

    /**
     * Tells whether a {@link SchedulableResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SchedulableResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SchedulableResource_Classifier >> then instantiate a {@link SchedulableResourceClassifier} proxy.
     * 
     * @return a {@link SchedulableResourceClassifier} proxy on the created {@link Classifier}.
     */
    public static SchedulableResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceClassifier.STEREOTYPE_NAME);
        return SchedulableResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceClassifier} proxy from a {@link Classifier} stereotyped << SchedulableResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SchedulableResourceClassifier} proxy or <i>null</i>.
     */
    public static SchedulableResourceClassifier instantiate(final Classifier obj) {
        return SchedulableResourceClassifier.canInstantiate(obj) ? new SchedulableResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceClassifier} proxy from a {@link Classifier} stereotyped << SchedulableResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SchedulableResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SchedulableResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SchedulableResourceClassifier.canInstantiate(obj))
        	return new SchedulableResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SchedulableResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SchedulableResourceClassifier other = (SchedulableResourceClassifier) obj;
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
     * Getter for string property 'SchedulableResource_Classifier_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSchedulableResource_Classifier_dependentScheduler() {
        return this.elt.getTagValue(SchedulableResourceClassifier.MdaTypes.SCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SchedulableResource_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSchedulableResource_Classifier_host() {
        return this.elt.getTagValue(SchedulableResourceClassifier.MdaTypes.SCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SchedulableResource_Classifier_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSchedulableResource_Classifier_schedParams() {
        return this.elt.getTagValues(SchedulableResourceClassifier.MdaTypes.SCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SchedulableResource_Classifier_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSchedulableResource_Classifier_dependentScheduler(final String value) {
        this.elt.putTagValue(SchedulableResourceClassifier.MdaTypes.SCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SchedulableResource_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSchedulableResource_Classifier_host(final String value) {
        this.elt.putTagValue(SchedulableResourceClassifier.MdaTypes.SCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SchedulableResource_Classifier_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSchedulableResource_Classifier_schedParams(final List<String> values) {
        this.elt.putTagValues(SchedulableResourceClassifier.MdaTypes.SCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    protected SchedulableResourceClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE_ELT;

        public static TagType SCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE_ELT;

        public static TagType SCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "31afaac7-0f4e-11df-8c52-0014222a9f79");
            SCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4d5274e0-14c6-11df-92f7-001302895b2b");
            SCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "551488be-14c6-11df-92f7-001302895b2b");
            SCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5a638e0a-14c6-11df-92f7-001302895b2b");
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
