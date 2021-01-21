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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier.GaCommHostClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SaCommHost_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("bb39d252-fe63-4b7c-85f2-aad410232b55")
public class SaCommHostClassifier extends GaCommHostClassifier {
    @objid ("83c24402-6d8a-4323-a570-aac75ae21dfc")
    public static final String STEREOTYPE_NAME = "SaCommHost_Classifier";

    @objid ("956694a0-d864-4723-8ad7-2f9662962b2c")
    public static final String SACOMMHOST_CLASSIFIER_ISSCHED_TAGTYPE = "SaCommHost_Classifier_isSched";

    @objid ("77e2020a-82d1-426b-a6f9-b07289a45e41")
    public static final String SACOMMHOST_CLASSIFIER_SCHSLACK_TAGTYPE = "SaCommHost_Classifier_schSlack";

    /**
     * Tells whether a {@link SaCommHostClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SaCommHost_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9047a7d0-7723-46f1-9462-e8f22fdd61f2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SaCommHost_Classifier >> then instantiate a {@link SaCommHostClassifier} proxy.
     * 
     * @return a {@link SaCommHostClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("ffa0ba23-27a9-4b54-9daa-27c82c2b53d2")
    public static SaCommHostClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostClassifier.STEREOTYPE_NAME);
        return SaCommHostClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SaCommHostClassifier} proxy from a {@link Classifier} stereotyped << SaCommHost_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SaCommHostClassifier} proxy or <i>null</i>.
     */
    @objid ("dd74b528-a572-4649-ba7a-5142e31000fc")
    public static SaCommHostClassifier instantiate(final Classifier obj) {
        return SaCommHostClassifier.canInstantiate(obj) ? new SaCommHostClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaCommHostClassifier} proxy from a {@link Classifier} stereotyped << SaCommHost_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SaCommHostClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e9d22020-02f6-4069-8aae-a99d74068148")
    public static SaCommHostClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SaCommHostClassifier.canInstantiate(obj))
        	return new SaCommHostClassifier(obj);
        else
        	throw new IllegalArgumentException("SaCommHostClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cbac0323-d05a-4b33-8922-a058b48d9126")
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
        SaCommHostClassifier other = (SaCommHostClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("717f5102-0a8f-41a2-914f-eb07906a306c")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'SaCommHost_Classifier_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("897daa46-22bd-402e-9855-6d50b23d3828")
    public String getSaCommHost_Classifier_schSlack() {
        return this.elt.getTagValue(SaCommHostClassifier.MdaTypes.SACOMMHOST_CLASSIFIER_SCHSLACK_TAGTYPE_ELT);
    }

    @objid ("c9dac941-bea9-4bfe-9626-4c642fc5834d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaCommHost_Classifier_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69bd39ce-4ff0-4272-8718-4bfa6089866a")
    public boolean isSaCommHost_Classifier_isSched() {
        return this.elt.isTagged(SaCommHostClassifier.MdaTypes.SACOMMHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaCommHost_Classifier_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("428e05f9-fd2d-4c9c-bdb6-95ee974b0207")
    public void setSaCommHost_Classifier_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaCommHostClassifier.MdaTypes.SACOMMHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaCommHostClassifier.MdaTypes.SACOMMHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaCommHost_Classifier_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7d55790d-449b-4aa8-865d-2532eeb7d26e")
    public void setSaCommHost_Classifier_schSlack(final String value) {
        this.elt.putTagValue(SaCommHostClassifier.MdaTypes.SACOMMHOST_CLASSIFIER_SCHSLACK_TAGTYPE_ELT, value);
    }

    @objid ("18ecfd6e-dbc2-423b-bb73-b29cdaff1dad")
    protected SaCommHostClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("acc6d2aa-319f-4735-b9f5-ff428da06447")
    public static final class MdaTypes {
        @objid ("00317324-72ae-4cd6-a00a-f6cf8a5d4937")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d40bf586-d0e3-4623-afe2-9ce1b8644c4b")
        public static TagType SACOMMHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT;

        @objid ("9c28cdd4-2351-40b0-80ea-aa6ba89a1ed2")
        public static TagType SACOMMHOST_CLASSIFIER_SCHSLACK_TAGTYPE_ELT;

        @objid ("964ade0d-1b7b-44d2-b4d8-a800d3d99e71")
        private static Stereotype MDAASSOCDEP;

        @objid ("883cc649-1cdd-4d16-b256-ad3b64106735")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3df5a384-f5f4-47a3-b4d4-2c3b32dfda39")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b3e49b06-14ad-11df-9d54-0014222a9f79");
            SACOMMHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3e49b07-14ad-11df-9d54-0014222a9f79");
            SACOMMHOST_CLASSIFIER_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3e49b08-14ad-11df-9d54-0014222a9f79");
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
