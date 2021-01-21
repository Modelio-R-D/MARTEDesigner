/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.attribute;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SwResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("339b2560-99ef-4b76-a021-2fc35e96a6b8")
public class SwResourceAttribute extends ResourceAttribute {
    @objid ("2a94cdb3-f826-4db6-92ff-c4f7aaeaa399")
    public static final String STEREOTYPE_NAME = "SwResource_Attribute";

    @objid ("ac449f18-cf6a-4fb9-abba-4692705b36eb")
    public static final String SWRESOURCE_ATTRIBUTE_CREATESERVICES_TAGTYPE = "SwResource_Attribute_createServices";

    @objid ("03352c71-49c7-463c-9c1f-4f6c0b944383")
    public static final String SWRESOURCE_ATTRIBUTE_DELETESERVICES_TAGTYPE = "SwResource_Attribute_deleteServices";

    @objid ("9d44f4a2-df93-4550-9fab-3a110f9659ec")
    public static final String SWRESOURCE_ATTRIBUTE_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_Attribute_identifierElements";

    @objid ("93920c99-87fe-4537-a2cc-ed5904931293")
    public static final String SWRESOURCE_ATTRIBUTE_INITIALIZESERVICES_TAGTYPE = "SwResource_Attribute_initializeServices";

    @objid ("8e216275-5072-4b75-b76b-4712c3101bd0")
    public static final String SWRESOURCE_ATTRIBUTE_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_Attribute_memorySizeFootprint";

    @objid ("f62137a4-4715-4cc3-91ea-2c0e9f3029dc")
    public static final String SWRESOURCE_ATTRIBUTE_STATEELEMENTS_TAGTYPE = "SwResource_Attribute_stateElements";

    /**
     * Tells whether a {@link SwResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("82f11f93-b288-4fd8-80bd-23298284a970")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwResource_Attribute >> then instantiate a {@link SwResourceAttribute} proxy.
     * 
     * @return a {@link SwResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("ad96d620-0b79-4c1a-8b83-3e2f1bb1c163")
    public static SwResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceAttribute.STEREOTYPE_NAME);
        return SwResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceAttribute} proxy from a {@link Attribute} stereotyped << SwResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("9904c83d-691d-4c2c-9610-e7f2615dc32c")
    public static SwResourceAttribute instantiate(final Attribute obj) {
        return SwResourceAttribute.canInstantiate(obj) ? new SwResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwResourceAttribute} proxy from a {@link Attribute} stereotyped << SwResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SwResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c51ef610-f005-49a7-8413-d29bf3fd9637")
    public static SwResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwResourceAttribute.canInstantiate(obj))
        	return new SwResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("509d5604-2946-408b-b50d-280d45aadd89")
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
        SwResourceAttribute other = (SwResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("d37b59f1-c982-48f2-9eeb-eb0995f1a72c")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwResource_Attribute_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a543801e-c135-45e2-83a4-a0c06f207bb1")
    public List<String> getSwResource_Attribute_createServices() {
        return this.elt.getTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Attribute_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9b7327cf-9eae-487a-9948-7b129701c64f")
    public List<String> getSwResource_Attribute_deleteServices() {
        return this.elt.getTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Attribute_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a2a3f0fb-eff8-4daa-9ccf-62de1bcb3484")
    public List<String> getSwResource_Attribute_identifierElements() {
        return this.elt.getTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Attribute_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4d27bdf3-247b-457c-92b2-22495b738ad7")
    public List<String> getSwResource_Attribute_initializeServices() {
        return this.elt.getTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_Attribute_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4bb05605-d8b2-4c89-b81c-c5d583ccc0d1")
    public String getSwResource_Attribute_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Attribute_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("acbd4448-26e4-4777-acdd-9e187a63bd16")
    public List<String> getSwResource_Attribute_stateElements() {
        return this.elt.getTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_STATEELEMENTS_TAGTYPE_ELT);
    }

    @objid ("8faaf04d-172e-4db3-b939-1f5935473fe8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_Attribute_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1fcd4441-a7dc-4a01-9ff9-98eebef518af")
    public void setSwResource_Attribute_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Attribute_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3e9dd0bb-1326-430e-b318-52029caa35a1")
    public void setSwResource_Attribute_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Attribute_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("03d30d4a-1c97-44af-855c-dcf0626bf5c7")
    public void setSwResource_Attribute_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Attribute_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ab00fcec-1390-495b-8f0a-87d1ad8bfc77")
    public void setSwResource_Attribute_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_Attribute_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("13d99a93-2912-4a98-8f28-28a0d8a2ca10")
    public void setSwResource_Attribute_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_Attribute_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5434679b-871d-498d-a901-ea943e87e4c4")
    public void setSwResource_Attribute_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("932155fc-9893-421b-9353-e71b8f1f84de")
    protected SwResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("c869e89b-7a1b-41c6-a892-78f1229ec342")
    public static final class MdaTypes {
        @objid ("032a6b47-1d2a-43ad-a13b-b2b3bbb92e36")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a45d12aa-4534-4113-9b71-681efac0ce37")
        public static TagType SWRESOURCE_ATTRIBUTE_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        @objid ("813cacb0-8c23-4254-97a2-d1d3bf517b7d")
        public static TagType SWRESOURCE_ATTRIBUTE_STATEELEMENTS_TAGTYPE_ELT;

        @objid ("c8339227-82d7-4aab-9690-b812133e3005")
        public static TagType SWRESOURCE_ATTRIBUTE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        @objid ("e1d46f13-b7b9-4490-bbb3-633cbe7ae000")
        public static TagType SWRESOURCE_ATTRIBUTE_CREATESERVICES_TAGTYPE_ELT;

        @objid ("6580b80f-fc48-4150-82a3-3aa8a6fd1162")
        public static TagType SWRESOURCE_ATTRIBUTE_DELETESERVICES_TAGTYPE_ELT;

        @objid ("6b1eec15-ab70-47d6-8c15-6c1a696e2e2f")
        public static TagType SWRESOURCE_ATTRIBUTE_INITIALIZESERVICES_TAGTYPE_ELT;

        @objid ("da1f5a2b-bedc-46b6-95ef-17f1eae8c9a3")
        private static Stereotype MDAASSOCDEP;

        @objid ("50a69f45-46a3-4a0c-94ba-8bd376d9083e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c0c17c8b-2f06-4054-9a70-3fb678fa21ea")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a3265e-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ATTRIBUTE_IDENTIFIERELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32665-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ATTRIBUTE_STATEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a3266c-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ATTRIBUTE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32673-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ATTRIBUTE_CREATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588b3-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ATTRIBUTE_DELETESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588ba-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ATTRIBUTE_INITIALIZESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588c1-0ccf-11df-8525-001302895b2b");
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
