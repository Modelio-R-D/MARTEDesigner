/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << GaResourcesPlatform_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f2709741-553b-4d74-926c-1559aee656fe")
public class GaResourcesPlatformClassifier {
    @objid ("7957e652-e125-4ffe-98e5-21b402cc46e3")
    public static final String STEREOTYPE_NAME = "GaResourcesPlatform_Classifier";

    @objid ("eeab2903-6027-4784-a9fa-405eb6c01cfa")
    public static final String GARESOURCESPLATFORM_CLASSIFIER_RESOURCES_TAGTYPE = "GaResourcesPlatform_Classifier_resources";

    /**
     * The underlying {@link Classifier} represented by this proxy, never null.
     */
    @objid ("0c68f725-a782-41d4-9312-228bdb845471")
    protected final Classifier elt;

    /**
     * Tells whether a {@link GaResourcesPlatformClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << GaResourcesPlatform_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("46fff109-5abf-4445-88d5-6b688ed75940")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaResourcesPlatformClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << GaResourcesPlatform_Classifier >> then instantiate a {@link GaResourcesPlatformClassifier} proxy.
     * 
     * @return a {@link GaResourcesPlatformClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("016cac08-7ced-4447-bcb1-0d6a36c68550")
    public static GaResourcesPlatformClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaResourcesPlatformClassifier.STEREOTYPE_NAME);
        return GaResourcesPlatformClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link GaResourcesPlatformClassifier} proxy from a {@link Classifier} stereotyped << GaResourcesPlatform_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link GaResourcesPlatformClassifier} proxy or <i>null</i>.
     */
    @objid ("a4559268-c5b0-4751-a1d6-72c564bc3b61")
    public static GaResourcesPlatformClassifier instantiate(final Classifier obj) {
        return GaResourcesPlatformClassifier.canInstantiate(obj) ? new GaResourcesPlatformClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaResourcesPlatformClassifier} proxy from a {@link Classifier} stereotyped << GaResourcesPlatform_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link GaResourcesPlatformClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("53e6266a-58fe-4d64-9248-e5d4e58b0877")
    public static GaResourcesPlatformClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (GaResourcesPlatformClassifier.canInstantiate(obj))
        	return new GaResourcesPlatformClassifier(obj);
        else
        	throw new IllegalArgumentException("GaResourcesPlatformClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d8e9e79e-013e-4c4c-b626-adafb1ff7dd9")
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
        GaResourcesPlatformClassifier other = (GaResourcesPlatformClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("931c310d-7840-4f61-bcf3-9fb8324946ed")
    public Classifier getElement() {
        return this.elt;
    }

    /**
     * Getter for List<String> property 'GaResourcesPlatform_Classifier_resources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6aac24db-ffe7-44ab-ae87-14c75ff0257c")
    public List<String> getGaResourcesPlatform_Classifier_resources() {
        return this.elt.getTagValues(GaResourcesPlatformClassifier.MdaTypes.GARESOURCESPLATFORM_CLASSIFIER_RESOURCES_TAGTYPE_ELT);
    }

    @objid ("0d0feb8b-6e37-4a1b-82c8-75e9255b97b7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaResourcesPlatform_Classifier_resources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a9359b89-4f07-4502-b238-ed851a3503f4")
    public void setGaResourcesPlatform_Classifier_resources(final List<String> values) {
        this.elt.putTagValues(GaResourcesPlatformClassifier.MdaTypes.GARESOURCESPLATFORM_CLASSIFIER_RESOURCES_TAGTYPE_ELT, values);
    }

    @objid ("830b9d10-fcc5-4f47-a8f9-bb66dca0d53f")
    protected GaResourcesPlatformClassifier(final Classifier elt) {
        this.elt = elt;
    }

    @objid ("fedbb319-50d5-476d-9903-8816406a8575")
    public static final class MdaTypes {
        @objid ("40ec526a-56fb-4fee-a07b-0be462637cdd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b6ec59c0-1c31-4f97-b24b-7f19ad772835")
        public static TagType GARESOURCESPLATFORM_CLASSIFIER_RESOURCES_TAGTYPE_ELT;

        @objid ("d1c62d9a-6953-4f2f-843d-807e644f5c27")
        private static Stereotype MDAASSOCDEP;

        @objid ("006e0ded-14d3-47c7-a39b-e1eed5ba8ebd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8fa342f7-8f8f-488f-9980-02ea907603b0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "038258be-0ccf-11df-8525-001302895b2b");
            GARESOURCESPLATFORM_CLASSIFIER_RESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "038258bf-0ccf-11df-8525-001302895b2b");
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
