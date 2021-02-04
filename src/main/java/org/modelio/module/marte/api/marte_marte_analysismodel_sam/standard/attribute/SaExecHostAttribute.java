/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.attribute.GaExecHostAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SaExecHost_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("26095360-8d0a-41f7-9a42-25d0c1dbf3a9")
public class SaExecHostAttribute extends GaExecHostAttribute {
    @objid ("fbb3780f-5766-49a1-9a8e-8b289de590e2")
    public static final String STEREOTYPE_NAME = "SaExecHost_Attribute";

    @objid ("55a9a37b-f93d-4c9c-aa9f-b382510d689b")
    public static final String SAEXECHOST_ATTRIBUTE_ISRPRIORANGE_TAGTYPE = "SaExecHost_Attribute_ISRprioRange";

    @objid ("6bb11868-2fa2-4099-b30c-02c783c17811")
    public static final String SAEXECHOST_ATTRIBUTE_ISRSWITCHT_TAGTYPE = "SaExecHost_Attribute_ISRswitchT";

    @objid ("2ce4e6f2-b578-4a4d-85d6-55c04e4e3cf5")
    public static final String SAEXECHOST_ATTRIBUTE_ISSCHED_TAGTYPE = "SaExecHost_Attribute_isSched";

    @objid ("71aa5027-1527-4b8e-98e6-24448e23239c")
    public static final String SAEXECHOST_ATTRIBUTE_SCHSLACK_TAGTYPE = "SaExecHost_Attribute_schSlack";

    @objid ("6c5da580-4688-4c6a-be5c-1ae0b241c210")
    public static final String SAEXECHOST_ATTRIBUTE_SCHEDUTILIZ_TAGTYPE = "SaExecHost_Attribute_schedUtiliz";

    /**
     * Tells whether a {@link SaExecHostAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SaExecHost_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1fab8969-ef5e-45b8-8144-6bce4b65b04a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SaExecHost_Attribute >> then instantiate a {@link SaExecHostAttribute} proxy.
     * 
     * @return a {@link SaExecHostAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("3641e162-9467-4c43-acac-d3d0c40b1458")
    public static SaExecHostAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostAttribute.STEREOTYPE_NAME);
        return SaExecHostAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SaExecHostAttribute} proxy from a {@link Attribute} stereotyped << SaExecHost_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SaExecHostAttribute} proxy or <i>null</i>.
     */
    @objid ("0d41370e-eed1-4c3f-a8f6-85a19e412594")
    public static SaExecHostAttribute instantiate(final Attribute obj) {
        return SaExecHostAttribute.canInstantiate(obj) ? new SaExecHostAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaExecHostAttribute} proxy from a {@link Attribute} stereotyped << SaExecHost_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SaExecHostAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dbccf993-1009-437b-9eff-e11ae0807680")
    public static SaExecHostAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SaExecHostAttribute.canInstantiate(obj))
        	return new SaExecHostAttribute(obj);
        else
        	throw new IllegalArgumentException("SaExecHostAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("710bc7bc-9524-4138-8ffd-bec98f42ca6a")
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
        SaExecHostAttribute other = (SaExecHostAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("79363726-905e-47fe-9583-0521397c0ae2")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'SaExecHost_Attribute_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e5f20bda-8633-4f66-b58f-f530553e4840")
    public String getSaExecHost_Attribute_ISRprioRange() {
        return this.elt.getTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_ISRPRIORANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Attribute_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2ee76c7c-f476-431b-acab-ffd6c7b21d3a")
    public String getSaExecHost_Attribute_ISRswitchT() {
        return this.elt.getTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_ISRSWITCHT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Attribute_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60420bf6-8aa4-41aa-96fb-eb5c8e37c4cc")
    public String getSaExecHost_Attribute_schSlack() {
        return this.elt.getTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Attribute_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("75a87678-7a2f-409a-b14a-f037c2cc5c0a")
    public String getSaExecHost_Attribute_schedUtiliz() {
        return this.elt.getTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_SCHEDUTILIZ_TAGTYPE_ELT);
    }

    @objid ("035fbd15-45c4-42c9-9f7d-6928c50cca45")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaExecHost_Attribute_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1154a62d-2a39-472d-baa9-6a683954fc8e")
    public boolean isSaExecHost_Attribute_isSched() {
        return this.elt.isTagged(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Attribute_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("13f09dd5-15d4-44d3-9f9f-2a2b472ceb96")
    public void setSaExecHost_Attribute_ISRprioRange(final String value) {
        this.elt.putTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_ISRPRIORANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Attribute_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cc759697-0530-4482-ae60-a2432f503c8a")
    public void setSaExecHost_Attribute_ISRswitchT(final String value) {
        this.elt.putTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_ISRSWITCHT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaExecHost_Attribute_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2f88cb91-dece-4cef-b64a-96d275a02d73")
    public void setSaExecHost_Attribute_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Attribute_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1b71fa5-ef21-49b9-b5e7-0ee8f2d37eaa")
    public void setSaExecHost_Attribute_schSlack(final String value) {
        this.elt.putTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Attribute_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("61b531bf-8452-4dbc-b87f-fd0486b6e8e0")
    public void setSaExecHost_Attribute_schedUtiliz(final String value) {
        this.elt.putTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_SCHEDUTILIZ_TAGTYPE_ELT, value);
    }

    @objid ("ec07e65a-3b47-4880-a9ef-6701cba678d5")
    protected SaExecHostAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("4410096c-418c-4688-b761-2d6c23f24564")
    public static final class MdaTypes {
        @objid ("3d62c33f-ba10-4034-8d81-5e78f11e6cd5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ad79a3e2-0a6f-4973-a9e3-ae07c5ada043")
        public static TagType SAEXECHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT;

        @objid ("47dd00e1-b1e0-427f-acfb-9a55c5a96633")
        public static TagType SAEXECHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT;

        @objid ("07f6c245-8f8a-4c5a-af47-260865fee740")
        public static TagType SAEXECHOST_ATTRIBUTE_SCHEDUTILIZ_TAGTYPE_ELT;

        @objid ("1570de14-5897-4496-809d-71aefc9088d0")
        public static TagType SAEXECHOST_ATTRIBUTE_ISRSWITCHT_TAGTYPE_ELT;

        @objid ("ed9866d0-4f67-46e1-b8c0-79111903a650")
        public static TagType SAEXECHOST_ATTRIBUTE_ISRPRIORANGE_TAGTYPE_ELT;

        @objid ("bf8505df-1171-427b-9baf-34acb55a2e18")
        private static Stereotype MDAASSOCDEP;

        @objid ("dc44e471-da8d-4a0b-95b9-6f66dabb37c8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("30dfbd7c-6eaf-4fee-80c0-ec7262592dd4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03a156eb-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b93d-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b944-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ATTRIBUTE_SCHEDUTILIZ_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b94b-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ATTRIBUTE_ISRSWITCHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b952-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ATTRIBUTE_ISRPRIORANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b959-0ccf-11df-8525-001302895b2b");
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
