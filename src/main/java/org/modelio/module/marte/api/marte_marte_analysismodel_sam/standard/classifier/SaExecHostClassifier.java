/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier.GaExecHostClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SaExecHost_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ec5b6f35-2f17-46c9-9844-ea85f39757ea")
public class SaExecHostClassifier extends GaExecHostClassifier {
    @objid ("7b553753-1ec4-4853-908a-f55c3c13b6ce")
    public static final String STEREOTYPE_NAME = "SaExecHost_Classifier";

    @objid ("03682536-fe15-4d95-845b-a27b80593109")
    public static final String SAEXECHOST_CLASSIFIER_ISRPRIORANGE_TAGTYPE = "SaExecHost_Classifier_ISRprioRange";

    @objid ("bca9b0df-6468-4d0a-8411-875ac38891db")
    public static final String SAEXECHOST_CLASSIFIER_ISRSWITCHT_TAGTYPE = "SaExecHost_Classifier_ISRswitchT";

    @objid ("728632b7-7e27-4847-9483-f6f3751cf4a6")
    public static final String SAEXECHOST_CLASSIFIER_ISSCHED_TAGTYPE = "SaExecHost_Classifier_isSched";

    @objid ("ce91f390-81e1-4dba-817c-28f2b66a5fa9")
    public static final String SAEXECHOST_CLASSIFIER_SCHSLACK_TAGTYPE = "SaExecHost_Classifier_schSlack";

    @objid ("9a9ab0bb-5e70-4eaf-839e-80be143b4a0f")
    public static final String SAEXECHOST_CLASSIFIER_SCHEDUTILIZ_TAGTYPE = "SaExecHost_Classifier_schedUtiliz";

    /**
     * Tells whether a {@link SaExecHostClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SaExecHost_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2af42999-2495-4cdb-a2f3-8cb4ed1686e9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SaExecHost_Classifier >> then instantiate a {@link SaExecHostClassifier} proxy.
     * 
     * @return a {@link SaExecHostClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("8ea6e9f4-1819-4c93-99e8-61c92a79ab37")
    public static SaExecHostClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostClassifier.STEREOTYPE_NAME);
        return SaExecHostClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SaExecHostClassifier} proxy from a {@link Classifier} stereotyped << SaExecHost_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SaExecHostClassifier} proxy or <i>null</i>.
     */
    @objid ("b75284e4-770f-4e88-93c5-48e27590bafe")
    public static SaExecHostClassifier instantiate(final Classifier obj) {
        return SaExecHostClassifier.canInstantiate(obj) ? new SaExecHostClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaExecHostClassifier} proxy from a {@link Classifier} stereotyped << SaExecHost_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SaExecHostClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b24d247e-1f8c-4fba-a9d2-a56fa528fc76")
    public static SaExecHostClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SaExecHostClassifier.canInstantiate(obj))
        	return new SaExecHostClassifier(obj);
        else
        	throw new IllegalArgumentException("SaExecHostClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9153a1ea-4f2e-4d46-b9b6-bd45959ee843")
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
        SaExecHostClassifier other = (SaExecHostClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("1de19876-5cb2-481d-94aa-f9c287f50860")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'SaExecHost_Classifier_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6d1f28fb-cc32-413d-914c-91650e8d03d9")
    public String getSaExecHost_Classifier_ISRprioRange() {
        return this.elt.getTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_ISRPRIORANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Classifier_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c90f9a86-df8c-44f0-bb6c-455240ffca60")
    public String getSaExecHost_Classifier_ISRswitchT() {
        return this.elt.getTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_ISRSWITCHT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Classifier_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4012f7a6-b8b2-476b-a55e-b6f433d56679")
    public String getSaExecHost_Classifier_schSlack() {
        return this.elt.getTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Classifier_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eadfaeef-cf8f-46f7-96ef-a1ac6857610e")
    public String getSaExecHost_Classifier_schedUtiliz() {
        return this.elt.getTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_SCHEDUTILIZ_TAGTYPE_ELT);
    }

    @objid ("d835a8e7-2f3c-41e8-b30a-220a42ee5d5d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaExecHost_Classifier_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a299c0c5-7318-4ef5-9464-b87316fabaeb")
    public boolean isSaExecHost_Classifier_isSched() {
        return this.elt.isTagged(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Classifier_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2941d266-e0b1-4ce3-a217-96d929820ab0")
    public void setSaExecHost_Classifier_ISRprioRange(final String value) {
        this.elt.putTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_ISRPRIORANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Classifier_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6ef2f9dd-886e-42df-a4af-6cc0e3b74509")
    public void setSaExecHost_Classifier_ISRswitchT(final String value) {
        this.elt.putTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_ISRSWITCHT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaExecHost_Classifier_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8712840b-3f8b-4f5b-9e58-a60925718c20")
    public void setSaExecHost_Classifier_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Classifier_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6a0a0931-cce2-431a-acec-df9e08f65ad3")
    public void setSaExecHost_Classifier_schSlack(final String value) {
        this.elt.putTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Classifier_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4a636864-8038-4381-b992-a02da66bfae9")
    public void setSaExecHost_Classifier_schedUtiliz(final String value) {
        this.elt.putTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_SCHEDUTILIZ_TAGTYPE_ELT, value);
    }

    @objid ("aebe2925-9e00-4d8b-baf5-730fda1a4571")
    protected SaExecHostClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("e8d5bf7f-bc60-434a-a5e2-b74a40338126")
    public static final class MdaTypes {
        @objid ("14533932-8dd9-4ad2-8bfa-dad0088e9ac8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("de54c564-953e-4197-ac58-f71df146e5e5")
        public static TagType SAEXECHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT;

        @objid ("2bc56179-1222-4ab3-843b-469cd6237985")
        public static TagType SAEXECHOST_CLASSIFIER_SCHSLACK_TAGTYPE_ELT;

        @objid ("d0f94530-8ee8-44fc-a558-5dc5f2e08bc3")
        public static TagType SAEXECHOST_CLASSIFIER_SCHEDUTILIZ_TAGTYPE_ELT;

        @objid ("fb43d736-1931-43b7-ac51-16d753e52f8b")
        public static TagType SAEXECHOST_CLASSIFIER_ISRSWITCHT_TAGTYPE_ELT;

        @objid ("c72ec715-d633-4c3f-883c-d7376f595453")
        public static TagType SAEXECHOST_CLASSIFIER_ISRPRIORANGE_TAGTYPE_ELT;

        @objid ("81310962-c84d-41e6-af8a-e444287994eb")
        private static Stereotype MDAASSOCDEP;

        @objid ("a122d5f9-91aa-4c91-9fd2-99938b1a9be1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("39c0d9c9-b36e-413d-90d5-b56666182bc1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f89914f3-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f89914f4-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_CLASSIFIER_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f89914f5-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_CLASSIFIER_SCHEDUTILIZ_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f89914f6-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_CLASSIFIER_ISRSWITCHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f89914f7-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_CLASSIFIER_ISRPRIORANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f89914f8-14ad-11df-9d54-0014222a9f79");
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
