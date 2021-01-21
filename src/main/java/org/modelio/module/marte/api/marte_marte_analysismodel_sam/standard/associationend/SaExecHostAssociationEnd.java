/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.associationend.GaExecHostAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SaExecHost_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d96aff3d-d92c-4d72-b6ad-56a6094a819f")
public class SaExecHostAssociationEnd extends GaExecHostAssociationEnd {
    @objid ("b298034b-e4d5-4528-9e9e-41772eea5c59")
    public static final String STEREOTYPE_NAME = "SaExecHost_AssociationEnd";

    @objid ("58530448-1a4c-46b7-893f-dbf0b60d0abf")
    public static final String SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE_TAGTYPE = "SaExecHost_AssociationEnd_ISRprioRange";

    @objid ("da948dbc-d742-433d-91c0-5333ababcdbf")
    public static final String SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT_TAGTYPE = "SaExecHost_AssociationEnd_ISRswitchT";

    @objid ("fbc591d2-5d20-4782-83d0-df026fa768cb")
    public static final String SAEXECHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE = "SaExecHost_AssociationEnd_isSched";

    @objid ("68e4ed1b-4e7b-4161-b589-ac0a18b6b554")
    public static final String SAEXECHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE = "SaExecHost_AssociationEnd_schSlack";

    @objid ("4764771f-8938-4c32-9473-4f8083808a71")
    public static final String SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ_TAGTYPE = "SaExecHost_AssociationEnd_schedUtiliz";

    /**
     * Tells whether a {@link SaExecHostAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SaExecHost_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ba181daa-966c-4577-93c4-4102ae33d324")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SaExecHost_AssociationEnd >> then instantiate a {@link SaExecHostAssociationEnd} proxy.
     * 
     * @return a {@link SaExecHostAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("817dbead-58c9-4b63-861a-d5f6fb7bebe8")
    public static SaExecHostAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostAssociationEnd.STEREOTYPE_NAME);
        return SaExecHostAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SaExecHostAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SaExecHost_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SaExecHostAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("714bf1ae-3ea7-4fbe-9857-c923658ad27b")
    public static SaExecHostAssociationEnd instantiate(final AssociationEnd obj) {
        return SaExecHostAssociationEnd.canInstantiate(obj) ? new SaExecHostAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaExecHostAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SaExecHost_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SaExecHostAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("aa239fd0-82fc-4ac6-8788-37c437753fae")
    public static SaExecHostAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SaExecHostAssociationEnd.canInstantiate(obj))
        	return new SaExecHostAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SaExecHostAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("93eed4b2-9678-44a5-92cf-69f8941b05ec")
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
        SaExecHostAssociationEnd other = (SaExecHostAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("d4704f62-3762-41d0-a75e-b0539fa83cc3")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'SaExecHost_AssociationEnd_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aa6f8aa4-b468-4b68-ae78-8bbe29e6a784")
    public String getSaExecHost_AssociationEnd_ISRprioRange() {
        return this.elt.getTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_AssociationEnd_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1b61c0a1-cb2b-4c3d-820c-67c16af270d6")
    public String getSaExecHost_AssociationEnd_ISRswitchT() {
        return this.elt.getTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_AssociationEnd_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9b65847a-aaef-4671-b870-6ae26cf320e4")
    public String getSaExecHost_AssociationEnd_schSlack() {
        return this.elt.getTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_AssociationEnd_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3433b8a-8bd5-48f9-b0c5-076ffe29831c")
    public String getSaExecHost_AssociationEnd_schedUtiliz() {
        return this.elt.getTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ_TAGTYPE_ELT);
    }

    @objid ("591e1c16-ddd3-4e8c-b2eb-7a3a2874dff7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaExecHost_AssociationEnd_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69402f6f-f18d-47b0-adb0-5063c0fdd8a4")
    public boolean isSaExecHost_AssociationEnd_isSched() {
        return this.elt.isTagged(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_AssociationEnd_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("459940cf-4f82-4573-8881-27d188469136")
    public void setSaExecHost_AssociationEnd_ISRprioRange(final String value) {
        this.elt.putTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_AssociationEnd_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("313e5cc3-0af6-4dda-9103-2bcba0fb5dcb")
    public void setSaExecHost_AssociationEnd_ISRswitchT(final String value) {
        this.elt.putTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaExecHost_AssociationEnd_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("132a261e-758c-46fe-91c8-405a143e8acc")
    public void setSaExecHost_AssociationEnd_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_AssociationEnd_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5870541f-c373-4535-ba13-e03307adf95f")
    public void setSaExecHost_AssociationEnd_schSlack(final String value) {
        this.elt.putTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_AssociationEnd_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ce8c4d1-9116-441f-9251-9c00240c20a3")
    public void setSaExecHost_AssociationEnd_schedUtiliz(final String value) {
        this.elt.putTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ_TAGTYPE_ELT, value);
    }

    @objid ("a03d75e7-1d1b-4d1a-a1ee-39d0115e0751")
    protected SaExecHostAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("2d59c7ac-e4f3-435f-b3cf-05ea7ebfc84d")
    public static final class MdaTypes {
        @objid ("c4dafd1d-b08f-4d84-86b9-a80270df706a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b4701d06-b011-4316-85de-0b038b76e2cb")
        public static TagType SAEXECHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT;

        @objid ("426c35f0-ab64-41ce-9553-23d0dc405fd6")
        public static TagType SAEXECHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT;

        @objid ("a33bb8ff-6bd8-4e6a-b3c3-26347b759a83")
        public static TagType SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ_TAGTYPE_ELT;

        @objid ("71aaaffa-b91b-4b0b-85ac-560d78371c7a")
        public static TagType SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT_TAGTYPE_ELT;

        @objid ("b6768450-1482-42c1-8d57-46d629e0196c")
        public static TagType SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE_TAGTYPE_ELT;

        @objid ("186a748f-37d8-46f3-9b26-a064e1e8cb7a")
        private static Stereotype MDAASSOCDEP;

        @objid ("a18722fb-0ea4-4538-9ff2-d05685c1586d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a2ab55ee-8a44-4d45-9e11-bb9c6a247c96")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03a156e9-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b93b-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b942-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b949-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b950-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b957-0ccf-11df-8525-001302895b2b");
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
