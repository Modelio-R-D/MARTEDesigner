/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute;

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
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.attribute.SwResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SwInteractionResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d51fe2f7-2200-465a-af0f-a5000df1abcb")
public class SwInteractionResourceAttribute extends SwResourceAttribute {
    @objid ("78ae2221-caed-44aa-afe1-54ad8f158533")
    public static final String STEREOTYPE_NAME = "SwInteractionResource_Attribute";

    @objid ("8584dd4b-e98b-43f2-88d8-2685a4e82c4c")
    public static final String SWINTERACTIONRESOURCE_ATTRIBUTE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE = "SwInteractionResource_Attribute_isIntraMemoryPartitionInteraction";

    @objid ("4c0999ca-d366-4a3e-9729-54a748bb84aa")
    public static final String SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGPOLICYELEMENTS_TAGTYPE = "SwInteractionResource_Attribute_waitingPolicyElements";

    @objid ("72dc59cb-7740-42b7-b9eb-5782c9bb2795")
    public static final String SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUECAPACITY_TAGTYPE = "SwInteractionResource_Attribute_waitingQueueCapacity";

    @objid ("0c407ae8-9134-4a35-9de1-fff5acd46275")
    public static final String SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUEPOLICY_TAGTYPE = "SwInteractionResource_Attribute_waitingQueuePolicy";

    /**
     * Tells whether a {@link SwInteractionResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwInteractionResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("118432cf-7efb-4a30-95f0-0c2aa161a9e5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwInteractionResource_Attribute >> then instantiate a {@link SwInteractionResourceAttribute} proxy.
     * 
     * @return a {@link SwInteractionResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("29264365-0325-4ce6-a700-7d30b8866198")
    public static SwInteractionResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceAttribute.STEREOTYPE_NAME);
        return SwInteractionResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceAttribute} proxy from a {@link Attribute} stereotyped << SwInteractionResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwInteractionResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("2f0c86ee-01d7-42c9-bac2-5ec9bd5560f8")
    public static SwInteractionResourceAttribute instantiate(final Attribute obj) {
        return SwInteractionResourceAttribute.canInstantiate(obj) ? new SwInteractionResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceAttribute} proxy from a {@link Attribute} stereotyped << SwInteractionResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SwInteractionResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0adf738f-4df2-4551-a81a-756435e356e4")
    public static SwInteractionResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwInteractionResourceAttribute.canInstantiate(obj))
        	return new SwInteractionResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwInteractionResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e9e56730-6a71-4944-acaa-32baf2284468")
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
        SwInteractionResourceAttribute other = (SwInteractionResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("f37e479d-6e21-45c3-888b-c599bbdd8796")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwInteractionResource_Attribute_waitingPolicyElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9f93f662-7669-469d-b006-31871cea28ef")
    public List<String> getSwInteractionResource_Attribute_waitingPolicyElements() {
        return this.elt.getTagValues(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Attribute_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7b9ade2c-6961-4d4f-8c0b-3a045620c670")
    public String getSwInteractionResource_Attribute_waitingQueueCapacity() {
        return this.elt.getTagValue(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUECAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Attribute_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("17504fdd-b92c-419d-ae62-3dc0aa420d34")
    public String getSwInteractionResource_Attribute_waitingQueuePolicy() {
        return this.elt.getTagValue(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUEPOLICY_TAGTYPE_ELT);
    }

    @objid ("0a87d936-cf5c-4cb1-a1aa-3439001ca1e1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwInteractionResource_Attribute_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4c302b4e-26c7-4e96-8c98-20ad7f5a0f35")
    public boolean isSwInteractionResource_Attribute_isIntraMemoryPartitionInteraction() {
        return this.elt.isTagged(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwInteractionResource_Attribute_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9849e392-ec64-48bb-9a43-6ed06e3a0786")
    public void setSwInteractionResource_Attribute_isIntraMemoryPartitionInteraction(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwInteractionResource_Attribute_waitingPolicyElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a164b098-2acf-4add-932c-0664430bd128")
    public void setSwInteractionResource_Attribute_waitingPolicyElements(final List<String> values) {
        this.elt.putTagValues(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwInteractionResource_Attribute_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bd0fb6d5-f4c8-489e-8492-cc6cb62bbdd1")
    public void setSwInteractionResource_Attribute_waitingQueueCapacity(final String value) {
        this.elt.putTagValue(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUECAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwInteractionResource_Attribute_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7e405efa-4bff-4a24-b39c-6217408ce3ed")
    public void setSwInteractionResource_Attribute_waitingQueuePolicy(final String value) {
        this.elt.putTagValue(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("8eacf04b-7dec-4597-83ee-c153d1b6db92")
    protected SwInteractionResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("3399d08c-5625-4fc1-8f4e-07401ae7516a")
    public static final class MdaTypes {
        @objid ("33e4f8fb-fe6f-4888-8f8c-322fcba6d7e8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("64328746-6e3f-43ad-886c-fefbb4b9079b")
        public static TagType SWINTERACTIONRESOURCE_ATTRIBUTE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT;

        @objid ("21c87fa5-cde4-408b-8445-31b465f01c7d")
        public static TagType SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("9b1f25ec-32eb-4567-986b-838f41cdb556")
        public static TagType SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUECAPACITY_TAGTYPE_ELT;

        @objid ("938732ba-16ff-4c86-aea0-c096640220b1")
        public static TagType SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT;

        @objid ("bee71d65-ae01-4b39-8dd3-8d376cd81df4")
        private static Stereotype MDAASSOCDEP;

        @objid ("ba5354ab-5473-4dba-88bf-f37e253eeb8f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6db50d04-3f08-4ac9-acf8-3699136ef84c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "020c0c76-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_ATTRIBUTE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c7d-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c84-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUECAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c8b-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020e6ec7-0ccf-11df-8525-001302895b2b");
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
