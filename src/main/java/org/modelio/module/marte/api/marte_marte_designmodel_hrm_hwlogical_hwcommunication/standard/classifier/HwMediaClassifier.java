/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << HwMedia_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("698992a9-1587-4f10-9cd6-dc73855f5b59")
public class HwMediaClassifier extends HwCommunicationResourceClassifier {
    @objid ("a2a261aa-293a-41bc-8af5-8974ef8b5af3")
    public static final String STEREOTYPE_NAME = "HwMedia_Classifier";

    @objid ("cce2572e-047b-4ffd-80b0-e70a344c4498")
    public static final String HWMEDIA_CLASSIFIER_ARBITERS_TAGTYPE = "HwMedia_Classifier_arbiters";

    @objid ("0d191c09-f7d3-4220-8db7-215372951b7b")
    public static final String HWMEDIA_CLASSIFIER_BANDWIDTH_TAGTYPE = "HwMedia_Classifier_bandwidth";

    /**
     * Tells whether a {@link HwMediaClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwMedia_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d2b16864-1ac4-4e10-a219-6601527be7b8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwMedia_Classifier >> then instantiate a {@link HwMediaClassifier} proxy.
     * 
     * @return a {@link HwMediaClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("8e2c6061-485e-47c7-a9f1-4378107412eb")
    public static HwMediaClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaClassifier.STEREOTYPE_NAME);
        return HwMediaClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwMediaClassifier} proxy from a {@link Classifier} stereotyped << HwMedia_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwMediaClassifier} proxy or <i>null</i>.
     */
    @objid ("9d949abf-eb4b-4d8b-b482-bd7c420ab963")
    public static HwMediaClassifier instantiate(final Classifier obj) {
        return HwMediaClassifier.canInstantiate(obj) ? new HwMediaClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMediaClassifier} proxy from a {@link Classifier} stereotyped << HwMedia_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwMediaClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9bdd7a0b-1407-45ba-bdcc-93060dd84c29")
    public static HwMediaClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwMediaClassifier.canInstantiate(obj))
        	return new HwMediaClassifier(obj);
        else
        	throw new IllegalArgumentException("HwMediaClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2001d8b2-069b-4da5-900e-ee7bff5025eb")
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
        HwMediaClassifier other = (HwMediaClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("cf91b7c8-63f0-42ce-8d17-86ef2abdc03e")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwMedia_Classifier_arbiters'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a1c3c1af-52f0-4ba3-a6f6-168bcd1baea6")
    public List<String> getHwMedia_Classifier_arbiters() {
        return this.elt.getTagValues(HwMediaClassifier.MdaTypes.HWMEDIA_CLASSIFIER_ARBITERS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMedia_Classifier_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6061ba76-3655-4f1c-9c01-6944fb34f11b")
    public String getHwMedia_Classifier_bandwidth() {
        return this.elt.getTagValue(HwMediaClassifier.MdaTypes.HWMEDIA_CLASSIFIER_BANDWIDTH_TAGTYPE_ELT);
    }

    @objid ("9fbed2d6-79b4-403d-9a93-ffda84c5dd00")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwMedia_Classifier_arbiters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("476e50b1-11ea-4f5a-af69-c36e2e2542d8")
    public void setHwMedia_Classifier_arbiters(final List<String> values) {
        this.elt.putTagValues(HwMediaClassifier.MdaTypes.HWMEDIA_CLASSIFIER_ARBITERS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMedia_Classifier_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("19c21216-ac24-486a-8093-6f498a233f16")
    public void setHwMedia_Classifier_bandwidth(final String value) {
        this.elt.putTagValue(HwMediaClassifier.MdaTypes.HWMEDIA_CLASSIFIER_BANDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("fe1e6505-ae37-4bbe-b2f7-8038dd65ce45")
    protected HwMediaClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("0284695b-4cae-4beb-a7ff-c2f7a458b83f")
    public static final class MdaTypes {
        @objid ("c5a89340-8b3e-4ba8-88ac-9540c8cd758c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("de978d7c-a44c-454d-8e9e-cbc4e62a4eb3")
        public static TagType HWMEDIA_CLASSIFIER_ARBITERS_TAGTYPE_ELT;

        @objid ("1def7041-8235-4711-adcd-e92db3b8c1a1")
        public static TagType HWMEDIA_CLASSIFIER_BANDWIDTH_TAGTYPE_ELT;

        @objid ("94b7374c-4b7f-47ec-9534-ce1a428d3d52")
        private static Stereotype MDAASSOCDEP;

        @objid ("3fb241ee-730b-4d4c-bc78-1be40f2dfce8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f0384546-5632-48bf-b584-b09131700434")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b7f970a4-10ac-11df-81d9-0014222a9f79");
            HWMEDIA_CLASSIFIER_ARBITERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "072bc409-1727-11df-b92a-0014222a9f79");
            HWMEDIA_CLASSIFIER_BANDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a9eaab7a-5d9c-11df-9e91-0014222a9f79");
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
