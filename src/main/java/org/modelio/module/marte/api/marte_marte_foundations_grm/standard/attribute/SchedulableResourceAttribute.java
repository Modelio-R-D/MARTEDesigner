/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("dfa297cf-379e-4a75-9f1d-5c3e3e36759d")
    public static final String STEREOTYPE_NAME = "SchedulableResource_Attribute";

    @objid ("f3197623-6237-4d09-99ff-60a92e8c96ee")
    public static final String SCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE = "SchedulableResource_Attribute_dependentScheduler";

    @objid ("b5edda7d-84e8-4308-b50c-37dc30bf8a86")
    public static final String SCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE = "SchedulableResource_Attribute_host";

    @objid ("091bac80-3ffe-4b4f-8b77-cd3ffc1503c1")
    public static final String SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE = "SchedulableResource_Attribute_schedParams";

    /**
     * Tells whether a {@link SchedulableResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SchedulableResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e58a78ab-d678-431d-83f3-8141b635c123")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SchedulableResource_Attribute >> then instantiate a {@link SchedulableResourceAttribute} proxy.
     * 
     * @return a {@link SchedulableResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("f54dad7e-ba51-4227-b409-ddcd95f0a34d")
    public static SchedulableResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceAttribute.STEREOTYPE_NAME);
        return SchedulableResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceAttribute} proxy from a {@link Attribute} stereotyped << SchedulableResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SchedulableResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("35e0367f-dea0-4f68-9d3e-366e560978e7")
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
    @objid ("ac47a541-12e5-4f4d-943e-2c44a2c96962")
    public static SchedulableResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SchedulableResourceAttribute.canInstantiate(obj))
        	return new SchedulableResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SchedulableResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7fd5585b-e564-401a-98bf-f47b6f797af9")
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
    @objid ("a4c2d5cc-96c1-43af-8ecd-1e29ec73df38")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'SchedulableResource_Attribute_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("675695f8-7db7-49c1-9363-b39ff2714707")
    public String getSchedulableResource_Attribute_dependentScheduler() {
        return this.elt.getTagValue(SchedulableResourceAttribute.MdaTypes.SCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SchedulableResource_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d5ecbebc-e2d8-4c0f-8437-d3eb84855e66")
    public String getSchedulableResource_Attribute_host() {
        return this.elt.getTagValue(SchedulableResourceAttribute.MdaTypes.SCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SchedulableResource_Attribute_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a92a907b-7540-4ec7-87e2-1041d38b03fa")
    public List<String> getSchedulableResource_Attribute_schedParams() {
        return this.elt.getTagValues(SchedulableResourceAttribute.MdaTypes.SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT);
    }

    @objid ("8141be53-1c62-4b1f-9825-5047d80fffa3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SchedulableResource_Attribute_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a97ef4e6-29a3-4fa3-91df-4251a7314954")
    public void setSchedulableResource_Attribute_dependentScheduler(final String value) {
        this.elt.putTagValue(SchedulableResourceAttribute.MdaTypes.SCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SchedulableResource_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09834a88-c155-4f1d-bcfa-cbd0ff5cf17a")
    public void setSchedulableResource_Attribute_host(final String value) {
        this.elt.putTagValue(SchedulableResourceAttribute.MdaTypes.SCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SchedulableResource_Attribute_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24ac8c2f-b475-4999-bd68-28238674fe1c")
    public void setSchedulableResource_Attribute_schedParams(final List<String> values) {
        this.elt.putTagValues(SchedulableResourceAttribute.MdaTypes.SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    @objid ("11dfd83a-c136-4c71-9031-9083211c65a8")
    protected SchedulableResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("cd929b41-77ec-4456-b4c1-5f23d7a2fd09")
    public static final class MdaTypes {
        @objid ("c71eb4ee-05df-4dbd-888d-9910a5c31a2d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7c6b726a-2702-40cf-8251-1424398e6f75")
        public static TagType SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("eb16c5e8-7e5f-417a-8f5a-98b9063433c3")
        public static TagType SCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT;

        @objid ("26ad96c2-dd9e-4bf5-827c-87d7db28d062")
        public static TagType SCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("a5007f08-8e6b-4db3-b419-c88433861694")
        private static Stereotype MDAASSOCDEP;

        @objid ("063bc93b-fe9a-483d-a901-4b482cd8650e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5bb92ee0-3f2b-4e0d-a40a-cdd7429a90a5")
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
