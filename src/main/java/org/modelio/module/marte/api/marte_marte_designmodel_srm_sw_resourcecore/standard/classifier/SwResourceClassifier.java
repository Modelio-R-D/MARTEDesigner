/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SwResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("be21c942-02c7-40b5-9da4-32aa17bf9a4f")
public class SwResourceClassifier extends ResourceClassifier {
    @objid ("5125982a-7844-4962-9a6b-09c9e19fbccc")
    public static final String STEREOTYPE_NAME = "SwResource_Classifier";

    @objid ("e0832d71-cfee-4e4c-b798-76133f3828be")
    public static final String SWRESOURCE_CLASSIFIER_CREATESERVICES_TAGTYPE = "SwResource_Classifier_createServices";

    @objid ("14e71709-100f-4a9e-a609-720e656629fc")
    public static final String SWRESOURCE_CLASSIFIER_DELETESERVICES_TAGTYPE = "SwResource_Classifier_deleteServices";

    @objid ("265dabb3-5b5b-4d84-8b48-358b3cb67432")
    public static final String SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_Classifier_identifierElements";

    @objid ("d90f4e66-055e-486d-b1b6-0af4a8796198")
    public static final String SWRESOURCE_CLASSIFIER_INITIALIZESERVICES_TAGTYPE = "SwResource_Classifier_initializeServices";

    @objid ("7ac4b2b2-6d47-4e43-a72d-bd24ec60b5c4")
    public static final String SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_Classifier_memorySizeFootprint";

    @objid ("05e90e16-f433-4f75-a612-13a76227035b")
    public static final String SWRESOURCE_CLASSIFIER_STATEELEMENTS_TAGTYPE = "SwResource_Classifier_stateElements";

    /**
     * Tells whether a {@link SwResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SwResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3c4d5aab-c2ba-463a-9fb2-6ef3a39c97fb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SwResource_Classifier >> then instantiate a {@link SwResourceClassifier} proxy.
     * 
     * @return a {@link SwResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("13c30ab2-bf65-4d28-b22b-0ca060cbb715")
    public static SwResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceClassifier.STEREOTYPE_NAME);
        return SwResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceClassifier} proxy from a {@link Classifier} stereotyped << SwResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SwResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("68416033-ee38-4464-b471-85ef5be4e92f")
    public static SwResourceClassifier instantiate(final Classifier obj) {
        return SwResourceClassifier.canInstantiate(obj) ? new SwResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwResourceClassifier} proxy from a {@link Classifier} stereotyped << SwResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SwResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5682db61-3912-478c-b64b-0195395e8df4")
    public static SwResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SwResourceClassifier.canInstantiate(obj))
        	return new SwResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SwResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8c5c3310-b6a4-4155-b4e2-90ebac3b242c")
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
        SwResourceClassifier other = (SwResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("7d5bb4f6-c343-49af-a4a3-ae9e29e59d04")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwResource_Classifier_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("037e3115-9b90-4817-8563-a981a8a1b6a2")
    public List<String> getSwResource_Classifier_createServices() {
        return this.elt.getTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Classifier_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b2e203c8-b904-4ed1-bda0-0b0f6b92d8a7")
    public List<String> getSwResource_Classifier_deleteServices() {
        return this.elt.getTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Classifier_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("95f9c97c-7976-40c2-888f-c4a999429898")
    public List<String> getSwResource_Classifier_identifierElements() {
        return this.elt.getTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Classifier_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a5f92b86-e32d-4719-8e81-908dd0021a72")
    public List<String> getSwResource_Classifier_initializeServices() {
        return this.elt.getTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_Classifier_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("224dded3-8b92-49f5-a4a4-ebabbc8f89e7")
    public String getSwResource_Classifier_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Classifier_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3ccdf918-829a-4dd1-b3d0-59c696711be8")
    public List<String> getSwResource_Classifier_stateElements() {
        return this.elt.getTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_STATEELEMENTS_TAGTYPE_ELT);
    }

    @objid ("d849a026-4f30-48ab-97ed-b4b017c18ff5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_Classifier_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e0a49b79-1c1d-49a4-a3a2-5c4ded77e017")
    public void setSwResource_Classifier_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Classifier_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("efa91ef9-f745-4117-b349-fb2f6cefc721")
    public void setSwResource_Classifier_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Classifier_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("405c4497-ed8d-4f1b-b6fe-6a998c10c275")
    public void setSwResource_Classifier_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Classifier_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d6ec761-335f-4da4-8961-54f152947b31")
    public void setSwResource_Classifier_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_Classifier_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0bf7101f-e0c4-4fdc-b3a7-cf1010827ba3")
    public void setSwResource_Classifier_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_Classifier_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2fdbb011-8b9a-44a0-9e14-3ec82573af6b")
    public void setSwResource_Classifier_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("4da666d6-f8ad-4c1e-91ac-e491ef0189e7")
    protected SwResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("d357fc4f-dded-4266-b943-36d5ea0dc5b0")
    public static final class MdaTypes {
        @objid ("db06bedb-01e1-4cf3-8b98-d72b2fbc8866")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5f224b56-c1d6-476f-a68f-8af72feda062")
        public static TagType SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        @objid ("7d88349d-5c60-4b1d-8b07-96697b2efbca")
        public static TagType SWRESOURCE_CLASSIFIER_STATEELEMENTS_TAGTYPE_ELT;

        @objid ("255bbf44-eb15-4215-9e8e-37ffe0382b63")
        public static TagType SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        @objid ("ba26f068-fb47-406f-955f-f20ad19965aa")
        public static TagType SWRESOURCE_CLASSIFIER_CREATESERVICES_TAGTYPE_ELT;

        @objid ("13978546-f9ab-4df9-8112-162285746cb9")
        public static TagType SWRESOURCE_CLASSIFIER_DELETESERVICES_TAGTYPE_ELT;

        @objid ("4f251f21-80ea-45f2-bb04-57744ccb3157")
        public static TagType SWRESOURCE_CLASSIFIER_INITIALIZESERVICES_TAGTYPE_ELT;

        @objid ("67f6d93f-2f48-480b-8ad2-31f254b01c0d")
        private static Stereotype MDAASSOCDEP;

        @objid ("ed6d898e-b193-477a-a4f6-601484b58f18")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0f2c8bb8-723e-4b0e-8b0f-e154119fe21b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3e9ae4b8-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e9ae4bd-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_CLASSIFIER_STATEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e9ae4be-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e9ae4b9-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_CLASSIFIER_CREATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e9ae4ba-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_CLASSIFIER_DELETESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e9ae4bb-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_CLASSIFIER_INITIALIZESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e9ae4bc-10c0-11df-81d9-0014222a9f79");
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
