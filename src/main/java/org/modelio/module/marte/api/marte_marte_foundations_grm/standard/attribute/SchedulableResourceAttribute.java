/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SchedulableResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b6aeaf22-e9a4-4fdf-a096-27c3be4ed411")
public class SchedulableResourceAttribute extends ResourceAttribute {
    @objid ("01c4c518-01de-4ec1-99bb-47e086c65a0c")
    public static final String STEREOTYPE_NAME = "SchedulableResource_Attribute";

    @objid ("3693c608-4ea6-4702-b2ea-7c0571355755")
    public static final String SCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE = "SchedulableResource_Attribute_dependentScheduler";

    @objid ("77775f04-63f7-4793-9f79-e48b38a7ec16")
    public static final String SCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE = "SchedulableResource_Attribute_host";

    @objid ("345bee1e-a246-467e-bedf-41b321eabb7e")
    public static final String SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE = "SchedulableResource_Attribute_schedParams";

    /**
     * Tells whether a {@link SchedulableResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SchedulableResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e292e1d9-f940-4d46-b46d-b79a9903418e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SchedulableResource_Attribute >> then instantiate a {@link SchedulableResourceAttribute} proxy.
     * 
     * @return a {@link SchedulableResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("6e59d743-8fdc-4159-90d4-c9a1f2e2f7de")
    public static SchedulableResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceAttribute.STEREOTYPE_NAME);
        return SchedulableResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceAttribute} proxy from a {@link Attribute} stereotyped << SchedulableResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SchedulableResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("2c8ad79e-1204-4b64-bdde-f22827ec1989")
    public static SchedulableResourceAttribute instantiate(final Attribute obj) {
        return SchedulableResourceAttribute.canInstantiate(obj) ? new SchedulableResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceAttribute} proxy from a {@link Attribute} stereotyped << SchedulableResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SchedulableResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f5151a4e-0387-46f6-b035-4ea33690ddbb")
    public static SchedulableResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SchedulableResourceAttribute.canInstantiate(obj))
        	return new SchedulableResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SchedulableResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("be6f43f1-2aba-4470-8a0f-23f04fd8b014")
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
        SchedulableResourceAttribute other = (SchedulableResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("320bfa03-22f7-483a-974a-89f3c7679d4d")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'SchedulableResource_Attribute_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bd30df4c-011a-4c8a-a968-7cc953051ecb")
    public String getSchedulableResource_Attribute_dependentScheduler() {
        return this.elt.getTagValue(SchedulableResourceAttribute.MdaTypes.SCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SchedulableResource_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("acecf217-a3df-4c58-82a2-72f27299629e")
    public String getSchedulableResource_Attribute_host() {
        return this.elt.getTagValue(SchedulableResourceAttribute.MdaTypes.SCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SchedulableResource_Attribute_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0f44efb3-e619-471a-bc1b-86b4ba526f38")
    public List<String> getSchedulableResource_Attribute_schedParams() {
        return this.elt.getTagValues(SchedulableResourceAttribute.MdaTypes.SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT);
    }

    @objid ("601b4c01-17c5-4c59-9a29-708969e89b59")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SchedulableResource_Attribute_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cb5c3a0b-41be-484a-8ca0-b9251cbe31aa")
    public void setSchedulableResource_Attribute_dependentScheduler(final String value) {
        this.elt.putTagValue(SchedulableResourceAttribute.MdaTypes.SCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SchedulableResource_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("20c5eaa9-7901-454c-90ba-713caaf4566c")
    public void setSchedulableResource_Attribute_host(final String value) {
        this.elt.putTagValue(SchedulableResourceAttribute.MdaTypes.SCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SchedulableResource_Attribute_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6dfc13bf-cf8c-4c59-8ff4-68f649457db0")
    public void setSchedulableResource_Attribute_schedParams(final List<String> values) {
        this.elt.putTagValues(SchedulableResourceAttribute.MdaTypes.SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    @objid ("cadf405e-c516-4b45-8915-e44f9b3440d0")
    protected SchedulableResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("cd929b41-77ec-4456-b4c1-5f23d7a2fd09")
    public static final class MdaTypes {
        @objid ("79cec990-1c57-4fa6-8c50-072cbc227e06")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e3be2f0b-2ac6-4fe9-ada1-6450ab91eebe")
        public static TagType SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("06ea9fd2-beac-47b9-bc7d-f60da2e65aed")
        public static TagType SCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT;

        @objid ("b0a48392-6826-4c59-b98e-eb0105f5ec9a")
        public static TagType SCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("7a16551e-b77f-48e3-a42f-4c1cfd8a9bb7")
        private static Stereotype MDAASSOCDEP;

        @objid ("cca5f666-3c56-4da0-899b-03dcaef945ba")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2a845586-4436-4f2f-9d67-f18fab09bb11")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "008e9936-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb87-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb8e-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb95-0ccf-11df-8525-001302895b2b");
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
