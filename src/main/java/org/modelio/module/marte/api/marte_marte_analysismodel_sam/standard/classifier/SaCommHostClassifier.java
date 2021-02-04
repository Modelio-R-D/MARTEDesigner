/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("adc3a9ad-6104-4dcd-8efe-63d64497e28b")
    public static final String STEREOTYPE_NAME = "SaCommHost_Classifier";

    @objid ("835b8220-e780-4230-a180-1b6927d3ce84")
    public static final String SACOMMHOST_CLASSIFIER_ISSCHED_TAGTYPE = "SaCommHost_Classifier_isSched";

    @objid ("d57c012e-4c32-4f40-a1ff-1b52ed47e499")
    public static final String SACOMMHOST_CLASSIFIER_SCHSLACK_TAGTYPE = "SaCommHost_Classifier_schSlack";

    /**
     * Tells whether a {@link SaCommHostClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SaCommHost_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("045bb53d-51c1-4e26-9c50-b04a3d24f492")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SaCommHost_Classifier >> then instantiate a {@link SaCommHostClassifier} proxy.
     * 
     * @return a {@link SaCommHostClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("2b8b7195-67e1-4644-aed8-b3ce29075faa")
    public static SaCommHostClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostClassifier.STEREOTYPE_NAME);
        return SaCommHostClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SaCommHostClassifier} proxy from a {@link Classifier} stereotyped << SaCommHost_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SaCommHostClassifier} proxy or <i>null</i>.
     */
    @objid ("d1f3eb45-9416-4106-ba30-118e36eb5cef")
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
    @objid ("3933e288-f5ad-4605-b63e-a7f09a51037d")
    public static SaCommHostClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SaCommHostClassifier.canInstantiate(obj))
        	return new SaCommHostClassifier(obj);
        else
        	throw new IllegalArgumentException("SaCommHostClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1978f990-c8ac-444f-9b6b-cad926d8202d")
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
    @objid ("77873c4f-4ffd-42b5-b78b-64e38fd4ba4a")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'SaCommHost_Classifier_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69b43def-1571-4cfc-8e20-46679c355714")
    public String getSaCommHost_Classifier_schSlack() {
        return this.elt.getTagValue(SaCommHostClassifier.MdaTypes.SACOMMHOST_CLASSIFIER_SCHSLACK_TAGTYPE_ELT);
    }

    @objid ("32c9427d-2db3-4d3f-954e-b352817fd6c6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaCommHost_Classifier_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3ec1eedc-2d63-44ee-936b-91809f54a868")
    public boolean isSaCommHost_Classifier_isSched() {
        return this.elt.isTagged(SaCommHostClassifier.MdaTypes.SACOMMHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaCommHost_Classifier_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f6cd213e-37b9-4f7f-a94f-dd99c3917795")
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
    @objid ("18777616-23ea-46b2-9eb6-dae09e7ef59d")
    public void setSaCommHost_Classifier_schSlack(final String value) {
        this.elt.putTagValue(SaCommHostClassifier.MdaTypes.SACOMMHOST_CLASSIFIER_SCHSLACK_TAGTYPE_ELT, value);
    }

    @objid ("6291635c-bacf-4fec-8826-57144c5a2990")
    protected SaCommHostClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("acc6d2aa-319f-4735-b9f5-ff428da06447")
    public static final class MdaTypes {
        @objid ("f601aa56-ad37-4bd3-9a3d-e6ab762b0989")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e0308091-4607-4e99-8682-77d498083f52")
        public static TagType SACOMMHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT;

        @objid ("c10790d6-0f40-4475-9445-e87d20368349")
        public static TagType SACOMMHOST_CLASSIFIER_SCHSLACK_TAGTYPE_ELT;

        @objid ("9d16eea3-4dee-44d1-9dea-80737789f2a6")
        private static Stereotype MDAASSOCDEP;

        @objid ("d7215d7e-d494-4222-9288-ce60f143bd4c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8d329676-ea92-43cc-a402-988e5311acca")
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
