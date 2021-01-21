/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << SchedulableResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("92d49219-dade-41b1-bce9-a266ee4500e0")
public class SchedulableResourceClassifier extends ResourceClassifier {
    @objid ("309352f0-2bc5-4b54-921d-c31124031241")
    public static final String STEREOTYPE_NAME = "SchedulableResource_Classifier";

    @objid ("bb7a9601-6d2e-431b-bac1-cd3c882e5dbc")
    public static final String SCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE = "SchedulableResource_Classifier_dependentScheduler";

    @objid ("1c318bfd-bacc-4c81-aeb2-ca60ee8a4dc2")
    public static final String SCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE = "SchedulableResource_Classifier_host";

    @objid ("aa221dc7-1638-42b0-8592-2ffe8d6d6d89")
    public static final String SCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE = "SchedulableResource_Classifier_schedParams";

    /**
     * Tells whether a {@link SchedulableResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SchedulableResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("37f64afa-40ac-4331-9e3a-e360512fdc73")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SchedulableResource_Classifier >> then instantiate a {@link SchedulableResourceClassifier} proxy.
     * 
     * @return a {@link SchedulableResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("3ca48ec4-af35-4fcd-b405-823893843fb8")
    public static SchedulableResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceClassifier.STEREOTYPE_NAME);
        return SchedulableResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceClassifier} proxy from a {@link Classifier} stereotyped << SchedulableResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SchedulableResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("993450a8-0ed6-431d-8015-aab215e13cbe")
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
    @objid ("fad6975f-d403-4d45-9161-4de2b388d7af")
    public static SchedulableResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SchedulableResourceClassifier.canInstantiate(obj))
        	return new SchedulableResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SchedulableResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("82f4f811-439e-4af6-8a47-7c61b715044c")
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
    @objid ("682639a9-e731-4ffe-b5f2-580c93e6b28d")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'SchedulableResource_Classifier_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9be65057-ef3c-45ca-8359-b8c53656ecb1")
    public String getSchedulableResource_Classifier_dependentScheduler() {
        return this.elt.getTagValue(SchedulableResourceClassifier.MdaTypes.SCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SchedulableResource_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("754bf02d-21fa-4981-8a27-0109392c4f34")
    public String getSchedulableResource_Classifier_host() {
        return this.elt.getTagValue(SchedulableResourceClassifier.MdaTypes.SCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SchedulableResource_Classifier_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0caf62c7-c5ee-4cc2-b332-e490695985c5")
    public List<String> getSchedulableResource_Classifier_schedParams() {
        return this.elt.getTagValues(SchedulableResourceClassifier.MdaTypes.SCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE_ELT);
    }

    @objid ("282a6132-3c91-450a-b153-31023c8a2fea")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SchedulableResource_Classifier_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a74c77c8-4673-4ff2-b7ec-98318fd6348f")
    public void setSchedulableResource_Classifier_dependentScheduler(final String value) {
        this.elt.putTagValue(SchedulableResourceClassifier.MdaTypes.SCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SchedulableResource_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90ed46f7-ff6c-473b-93b7-6c1fb39e4aff")
    public void setSchedulableResource_Classifier_host(final String value) {
        this.elt.putTagValue(SchedulableResourceClassifier.MdaTypes.SCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SchedulableResource_Classifier_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7ae90a83-f946-4a92-86e9-3c1e3c74cb4d")
    public void setSchedulableResource_Classifier_schedParams(final List<String> values) {
        this.elt.putTagValues(SchedulableResourceClassifier.MdaTypes.SCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    @objid ("7c7235a8-a17e-4b32-814a-5f4a010adeed")
    protected SchedulableResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("094990ec-e5fd-498d-b1cc-4a0a053d8983")
    public static final class MdaTypes {
        @objid ("76fae387-f288-4369-ab39-987df238c46b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2b1c9680-0094-4c07-83ff-90e27749de6c")
        public static TagType SCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("04b325df-d723-4c7b-b271-c08abf34b2b9")
        public static TagType SCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE_ELT;

        @objid ("a4e17aaf-84ef-4fbb-95d3-263fc0edb0b3")
        public static TagType SCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("27e95066-9fab-497b-89ac-2cf8f6bdc1c4")
        private static Stereotype MDAASSOCDEP;

        @objid ("1623b3cc-0f4d-4f2e-8b92-659a849062a3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c3bb67d2-37f2-4c28-8581-922d1054085f")
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
